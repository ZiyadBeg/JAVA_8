package com.wl.entites;

public class CardDto  implements Comparable<CardDto>{
private String cardName;
private Long cardBalance;
private String cardHolderName;
public String getCardName() {
	return cardName;
}
public void setCardName(String cardName) {
	this.cardName = cardName;
}
public Long getCardBalance() {
	return cardBalance;
}
public void setCardBalance(Long cardBalance) {
	this.cardBalance = cardBalance;
}
public String getCardHolderName() {
	return cardHolderName;
}
public void setCardHolderName(String cardHolderName) {
	this.cardHolderName = cardHolderName;
}
@Override
public int compareTo(CardDto o) {
	// TODO Auto-generated method stub
	return this.cardHolderName.compareTo(o.getCardHolderName());
}
@Override
public String toString() {
	return "CardDto [cardName=" + cardName + ", cardBalance=" + cardBalance + ", cardHolderName=" + cardHolderName
			+ "]";
}


}
