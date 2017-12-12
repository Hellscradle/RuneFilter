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

	public static Rarity fromString(String str) {
		for (Rarity r : Rarity.values()) {
			if(r.toString().equals(str)) {
				return r;
			}
		}
		return null;
	}

	public String toString() {return rarity;}
}