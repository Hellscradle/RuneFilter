package rune_filter;

import rune.*;

public class Filter {
	
	public Filter() {
		
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
		if(rune.getRuneType().toString().equals(type.toString())) {bool = true;}
		return bool;
	}
	
	//check rune slot
	//check rune rarity
	
	
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
		if(rune.getStat(0).getType().toString().equals(e.toString())) {
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
	
	//check by substat value
	//check if equipped
	//check efficiency
	//check max efficiency
	//check sell value
	//check markedforsale
	
}
