package rune;

public class Rune {	
	//rune data
	private int rune_id;
	private RuneType rune_type;
	private int rune_slot;
	private Rarity rune_rarity;
	private int quality;
	
	//rune stats
	private Stat mainStat;
	private Stat implicitStat;
	private Stat statOne;
	private Stat statTwo;
	private Stat statThree;
	private Stat statFour;
	
	//equipped and efficency stats
	private boolean equipped;
	private String equippedTo;
	private float runeEfficiency;
	private float runeMaxEfficiency;
	
	//could be relevant
	private int sellValue;
	private boolean markedForSale; 
	
	//full initialization
	public Rune(int id, int slot, int quality, RuneType type, Rarity rarity,
			Stat main, Stat imp, Stat one, Stat two, Stat three, Stat four,
			boolean equipped, String euippedTo, float runeEff, float runeMaxEff){
	
		this.rune_id = id;
		this.rune_type = type;
		this.rune_slot = slot;
		this.rune_rarity = rarity;
		this.quality = quality;
		this.mainStat = main;
		this.implicitStat = imp;
		this.statOne = one;
		this.statTwo = two;
		this.statThree = three;
		this.statFour = four;
		this.equipped = equipped;
		this.equippedTo = equippedTo;
		this.runeEfficiency = runeEff;
		this.runeMaxEfficiency = runeMaxEff;
	}
	//use to initialize later
	public Rune(){
		
	}
	
	//manually set values
	public void setRuneID(int id) {
		rune_id = id;
	}
	
	public void setRuneType(RuneType type) {
		
	}
	
	public void setRuneSlot(int slot) {
		
	}
	
	public void setRuneRarity(Rarity rarity) {
		this.rune_rarity = rarity;
	}
	
	public void setRuneQuality(int quality) {
		this.quality = quality;
		
	}
	
	public void setMain(Stat stat) {
		mainStat = stat;
	}
	public void setImplicit(Stat stat) {
		implicitStat = stat;
	}
	public void setStatOne(Stat stat) {
		statOne = stat;
	}
	public void setStatTwo(Stat stat) {
		statTwo = stat;
	}
	public void setStatThree(Stat stat) {
		statThree = stat;
	}
	public void setStatFour(Stat stat) {
		statFour = stat;
	}
	
	public void setEquipped(boolean eq) {
		equipped = eq;
	}
	
	public void setEquippedTo(String name) {
		equippedTo = name;
	}
	
	public void setEfficiency(float ef) {
		runeEfficiency = ef;
	}
	
	public void setMaxEfficiency(float ef) {
		runeMaxEfficiency = ef;
	}
	
	public void setSellValue(int value) {
		sellValue = value;
	}
	
	public void markForSale(boolean sell) {
		markedForSale = sell;
	}
	
	//retrieve values
	public Stat getMainStat() {return mainStat;}
	public Stat getImplicitStat() {return implicitStat;}
	public Stat getStatOne() {return statOne;}
	public Stat getStatTwo() {return statTwo;}
	public Stat getStatThree() {return statThree;}
	public Stat getStatFour() {return statFour;}
	
	//display rune
	public void displayRune() {
		System.out.println("Rune Type: " + rune_type.toString() + " Rune Slot: " + rune_slot);
		System.out.println("Rune Rarity: " + rune_rarity.toString() + " Rune Quality: " + quality);
		if (equipped) {
			System.out.println("Equipped to " + equippedTo);
		}else {
			System.out.println("Rune in storage");
		}
		if(mainStat != null) {
			mainStat.displayStat();
		}
		if(implicitStat != null) {
			implicitStat.displayStat();
		}
		if(statOne != null) {
			statOne.displayStat();
		}
		if(statTwo != null) {
			statTwo.displayStat();
		}
		if(statThree != null) {
			statThree.displayStat();
		}
		if(statFour != null) {
			statFour.displayStat();
		}
	}
	
}
