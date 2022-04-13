package com.wl.interfaceexp;

import java.util.Collections;
import java.util.List;

import com.wl.entites.CardDto;

public interface CardInterface {

	 default List<CardDto> getSortCardHolderName(List<CardDto> listCard){
		Collections.sort(listCard);
		return listCard;
	}
	
	public static long getMaxCardBalance(List<CardDto> listCard) {
		Long maxCardBalance = listCard.stream()
				 .map(CardDto::getCardBalance)
				 .max(Long::compare).get();
		return maxCardBalance;
		
	}
	
	List<CardDto> viewCardDetails(List<CardDto> list);
}
