package rune;

public enum Rarity {
	NORMAL ("Normal"),
	MAGIC ("Magic"),
	RARE ("Rare"),
	HERO ("Hero"),
	LEGEND ("Legend")
	;
	
	private final String rarity;
Rarity (String r){
	this.rarity = r;
}

public String toString() {return rarity;}
}