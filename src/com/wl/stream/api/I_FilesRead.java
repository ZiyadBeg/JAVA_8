package com.wl.stream.api;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class I_FilesRead {

	public static void main(String[] args) throws IOException {
		String path = "src/abc.txt";

		readFileUsingBuffereReader(path);
		System.out.println("--------------------------------File Read Using Stream--------------------");
		readFileUsingStream(path);
	}

	public static void readFileUsingStream(String path) throws IOException {
		Path filepath = Paths.get(path);
		Stream<String> lines = Files.lines(filepath);
		lines.forEach(System.out::println);
	}

	public static void readFileUsingBuffereReader(String path) {
		/* Using BufferReader */
		try (BufferedReader br = new BufferedReader(new FileReader(path));) {
			String content;
			while ((content = br.readLine()) != null) {
				System.out.println(content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
