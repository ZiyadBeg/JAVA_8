package com.wl.interfaceexp.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.wl.entites.CardDto;
import com.wl.interfaceexp.CardInterface;
import com.wl.interfaceexpImp.CardInterfaceImp;

public class Main {
public static void main(String[] args) {
/*Object Creating */
	
	CardDto cardDto =new CardDto();
	cardDto.setCardName("Racing Card");
	cardDto.setCardHolderName("mercedes");
	cardDto.setCardBalance(4555l);
	
	CardDto cardDto2 =new CardDto();
	cardDto2.setCardName("Motor Card");
	cardDto2.setCardHolderName("bullet");
	cardDto2.setCardBalance(500000l);
	
	CardDto cardDto3 =new CardDto();
	cardDto3.setCardName("Cycle Card");
	cardDto3.setCardHolderName("decathlon");
	cardDto3.setCardBalance(1500000l);
	List<CardDto> cardlist =new ArrayList<CardDto>();
	cardlist.add(cardDto);
	cardlist.add(cardDto2);
	cardlist.add(cardDto3);
	
	CardInterface cardInterface =new CardInterfaceImp();
	//Default Method
	cardInterface.getSortCardHolderName(cardlist);
	
	//normal Method
	List<CardDto> cardlistDetails =cardInterface.viewCardDetails(cardlist);
	Iterator< CardDto> itertor= cardlistDetails.iterator();
	while (itertor.hasNext()) {
		CardDto card= itertor.next();
		System.out.println(card);
		
	}	
	System.out.println();
	System.out.println("-----------------------MAX CARD BAL------------------");
System.out.println("MAX CARD BAL:  "+CardInterface.getMaxCardBalance(cardlist));
	

}
}
