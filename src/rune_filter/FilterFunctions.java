package rune_filter;

import rune.*;

public class FilterFunctions {
	
	public FilterFunctions() {
		
	}
	
	//check rune id
	public boolean hasID(Rune rune, int id) {
		boolean bool = false;
		if(rune.getRuneID() == id) {bool = true;}
		return bool;
	}
	
	//check rune type
	public boolean isRuneType(Rune rune, RuneType type) {
		boolean bool = false;
		if(rune.getRuneType() == type) {bool = true;}
		return bool;
	}
	
	//check rune grind amount
	public boolean isGrade(Rune rune, int min, int max) {
		boolean bool = false;
		if((rune.getGrade() >= min)&&(rune.getGrade() <= max)) {
			bool = true;
		}
		return bool;
	}
	
	//check rune slot
	public boolean isSlot(Rune rune, int slot) {
		boolean bool = false;
		if(rune.getRuneSlot() == slot) {bool = true;}
		return bool;
	}
	
	//check rune rarity
	public boolean isRarity(Rune rune, Rarity rarity) {
		boolean bool = false;
		if(rune.getRuneRarity() == rarity) {bool = true;}
		return bool;
	}
	
	//check rune level
	public boolean isBetweenLevels(Rune rune, int min, int max) {
		boolean bool = false;
		if(rune.getLevel() >= min && rune.getLevel() <= max) {
			bool = true;
		}
		return bool;
	}
	
	//check for primary stat
	public boolean hasPrimaryStat(Rune rune, StatEnum e) {
		boolean bool = false;
		if(rune.getStat(0).getType() == e) {
			bool = true;
		}
		return bool;
	}
	
	//check for implicit
	public boolean hasImplicit(Rune rune) {
		boolean bool = false;
		for(int i=0; i< rune.getStatListSize();i++) {
			if(rune.getStat(i).getStatLocation() == 5) {
				bool = true;
			}
			
		}
		return bool;
	}
	
	//check for a specific sub stat
	public boolean hasSubStat(Rune rune, StatEnum e) {
		boolean bool = false;
		for(int i=0; i< rune.getStatListSize();i++) {
			int x = rune.getStat(i).getStatLocation();
			if ((x > 0) && (x < 5)){
				if(rune.getStat(i).getType() == e) {
					bool = true;
				}
			}
		}
		return bool;
	}
	
	//check by substat value  (including grind)
	public boolean subHasValueTotal(Stat stat, float min, float max) {
		boolean bool = false;
		if ((stat.getValue()+stat.getGrindValue() >= min) && (stat.getValue()+stat.getGrindValue() <= max)) {
			bool = true;
		}
		return bool;
	}
	
	//check by substat value (raw)
	public boolean subHasValueRaw(Stat stat, float min, float max) {
		boolean bool = false;
		if ((stat.getValue() >= min) && (stat.getValue() <= max)) {
			bool = true;
		}
		return bool;
	}
	
	//check if stat is enchanted
	public boolean isEnchanted(Stat stat) {
		return stat.getEnchanted();
	}
	//check if stat is grinded
	public boolean isGrinded(Stat stat) {
		return stat.getIsGrinded();
	}
	
	//check if equipped
	public boolean isEquipped(Rune rune) {
		return rune.getEquipped();
	}
	
	//check if equipped, to whom
	public String equippedTo(Rune rune) {
		String name = null;
		if(rune.getEquipped()) {
			rune.getEquippedTo();
		}
		return name;
	}
	//check efficiency
	public boolean hasEfficiency(Rune rune, float min, float max) {
		boolean bool = false;
		if((rune.getRuneEfficiency() >= min) && (rune.getRuneEfficiency() <= max)) {
			bool = true;
		}
		return bool;
	}
	
	//check max efficiency
	public boolean hasMaxEfficiency(Rune rune, float min, float max) {
		boolean bool = false;
		if((rune.getRuneMaxEff() >= min) && (rune.getRuneMaxEff() <= max)) {
			bool = true;
		}
		return bool;
	}
	
	//check sell value
	public boolean hasSellValue(Rune rune, int valueMin, int valueMax) {
		boolean bool = false;
		if((rune.getSellValue() >= valueMin)&& (rune.getSellValue() <= valueMax)) {
			bool = true;
		}
		return bool;
	}
	//check markedforsale
	public boolean isForSale(Rune rune) {
		return rune.getForSale();
	}
	
}
