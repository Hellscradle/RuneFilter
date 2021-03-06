package rune;

import java.util.ArrayList;
import java.util.List;

public class Rune {	
	//rune data
	private int rune_id;
	private RuneType rune_type;
	private int rune_slot;
	private Rarity rune_rarity;
	private Rarity original_rarity;
	//grade = star rating
	private int grade;
	private int runeLevel;
	
	//stat array - rebuild 
	List<Stat> stats = new ArrayList<Stat>();
	
	//equipped and efficency stats
	private boolean equipped;
	private String equippedTo;
	private float runeEfficiency;
	private float runeMaxEfficiency;
	//private float barionRuneEfficiency;
	
	//could be relevant
	private int sellValue;
	private boolean markedForSale; 
	
	//full initialization
	public Rune(int id, int slot, RuneType type, Rarity rarity,Rarity original, int grade, int level, List<Stat> newStats,
			boolean equipped, String equippedTo, int sellValue, boolean markedForSale){
	
		this.rune_id = id;
		this.rune_type = type;
		this.rune_slot = slot;
		this.rune_rarity = rarity;
		this.original_rarity = original;
		this.runeLevel = level;
		this.equipped = equipped;
		this.grade = grade;
		this.equippedTo = equippedTo;
		this.sellValue = sellValue;
		this.markedForSale = markedForSale;
		this.stats = newStats;
	}
	
	//use to initialize later
	public Rune(){
		
	}
	
	//manually set values
	public void setRuneID(int id) {
		rune_id = id;
	}
	
	public void setRuneType(RuneType type) {
		this.rune_type = type;
	}
	
	public void setRuneSlot(int slot) {
		this.rune_slot = slot;
	}
	
	public void setRuneRarity(Rarity rarity) {
		this.rune_rarity = rarity;
	}
	
	public void setRuneGrade(int grade) {
		this.grade = grade;
		
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
	
	public void setLevel(int v) {this.runeLevel = v;}
	
	//retrieve values
	public int getRuneID() {return rune_id;}
	public RuneType getRuneType() {return rune_type;}
	public int getRuneSlot() {return rune_slot;}
	public Rarity getRuneRarity() {return rune_rarity;}
	public Rarity getOriginalRuneRarity() {return original_rarity;}
	public int getGrade() {return grade;}	
	public int getLevel() {return runeLevel;}
	public int getStatListSize() {return stats.size();}
	
	//retrieve stats
	public Stat getStat(int statPosition) {
		if(statPosition < stats.size()) {
			return stats.get(statPosition);
		}else {
			return null;
		}
		
	}
	
	public boolean getEquipped() {return equipped;}
	public String getEquippedTo() {return equippedTo;}
	public float getRuneEfficiency() {return runeEfficiency;}
	public float getRuneMaxEff() {return runeMaxEfficiency;}
	
	public int getSellValue() {return sellValue;}
	public boolean getForSale() {return markedForSale;}
	
	//display rune
	public void displayRune() {
		System.out.println("-----------------------------------");
		System.out.println("Type: " + rune_type.toString() + " 	 Slot: " + rune_slot + " Rune Grade: " + grade + "-Star	Rune Level: " + runeLevel);
		System.out.println("Rarity: " + rune_rarity.toString() + " 	 	Efficiency: " + runeEfficiency + "	 Max Efficiency: " + runeMaxEfficiency);
		if (equipped) {
			System.out.println("Equipped to " + equippedTo);
		}else {
			System.out.println("Rune in storage");
		}
		for(int i=0;i<stats.size();i++) {
			int loc = stats.get(i).getStatLocation();
			
			if(loc == 0) {
				System.out.println("Primary Stat");
			}else if (loc == 5) {
				System.out.println("Implicit Stat");
			}
			stats.get(i).displayStat();
		}
		System.out.println("-----------------------------------");
	}
	
}
