package rune_filter;

import rune.Rarity;
import rune.Rune;
import rune.StatEnum;

public class PredefinedFilter {
	FilterFunctions filter;
	
	
	public PredefinedFilter() {
		filter = new FilterFunctions();
	}
	
	//verified to work
	public boolean checkRune(Rune rune) {
		//check if legendary or at least a 6* Hero rune. Returns true if it is
		
		if(filter.isRarity(rune, Rarity.LEGEND)) {
			return true;	
		}else if(filter.isRarity(rune, Rarity.HERO) && filter.isGrade(rune, 6, 6)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkSynergy(Rune rune) {
		if(checkSlot(rune)) {
			if(checkFastAttacker(rune)) {
				return true;
			}
			if(checkSupport(rune)) {
				return true;
			}
			if(checkAttacker(rune)) {
				return true;
			}
			if(checkSupport(rune)) {
				return true;
			}
			if(checkBruiser(rune)) {
				return true;
			}
			if(checkDefAttacker(rune)) {
				return true;
			}
			if(checkHPAttacker(rune)) {
				return true;
			}
			if(checkAD(rune)) {
				return true;
			}
			if(checkStripper(rune)) {
				return true;
			}
		}
		return false;
	}
	
	//verified
	public boolean checkSlot(Rune rune) {
		boolean syn = false;
		//check if rune is slot 1,3,5, if yes check subs
		//if 2, 4, or 6, check primary stat. If flat, check for speed subs
		if((rune.getRuneSlot() == 1) || (rune.getRuneSlot() == 3) || (rune.getRuneSlot() == 5)) {
			syn = true;
		}else if(filter.hasPrimaryStat(rune, StatEnum.ATKFLAT)||filter.hasPrimaryStat(rune, StatEnum.HPFLAT)||filter.hasPrimaryStat(rune, StatEnum.DEFFLAT)||filter.hasPrimaryStat(rune, StatEnum.RESISTANCE)||filter.hasPrimaryStat(rune, StatEnum.ACCURACY)){
			if(filter.hasSubStat(rune, StatEnum.SPD)) {
				syn = true;
			}else {
				syn = false;
			}
		}else {
			syn = true;
		}
		return syn;
	}
	
	//verified
	public boolean checkFastAttacker(Rune rune) {
		boolean syn = false;
		int slotID = rune.getRuneSlot();
		int counter = 0;
		
		//if slot 1, check for atk%, spd, crit rate, crit damage
		if(slotID == 1 && filter.hasSubStat(rune, StatEnum.SPD)) {
			counter += 1;
			if(filter.hasSubStat(rune, StatEnum.ATKPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
				counter++;
			}
			if(counter >= 3) {
				syn = true;
			}
			
		}else if((slotID == 2 || slotID == 6) && filter.hasSubStat(rune, StatEnum.SPD)) {
			if(filter.hasPrimaryStat(rune, StatEnum.ATKPERCENT)){
				counter += 1;
				if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
					counter++;
				}
				if(counter >= 3) {
					syn = true;
				}
			}
		}else if(slotID == 4 && filter.hasSubStat(rune, StatEnum.SPD) ) {
			counter++;
			if(filter.hasPrimaryStat(rune, StatEnum.CRITDAMAGE)) {
				if(filter.hasSubStat(rune, StatEnum.ATKPERCENT)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
					counter++;
				}
				if(counter >= 2) {
					syn = true;
				}
			}
		}else if(slotID == 3 && filter.hasSubStat(rune, StatEnum.SPD)){
			counter++;
			if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
				counter++;
			}
			if(counter >= 3) {
				syn = true;
			}
			
		}else {
			if(filter.hasSubStat(rune, StatEnum.SPD)) {
				counter++;
				if(filter.hasSubStat(rune, StatEnum.ATKPERCENT)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
					counter++;
				}
				if(counter >= 3) {
					syn = true;
				}
			}
		}		
		return syn;
	}
	
	//verified 
	public boolean checkAttacker(Rune rune) {
		boolean syn = false;
		int slotID = rune.getRuneSlot();
		int counter = 0;
		
		//if slot 1, check for atk%, spd, crit rate, crit damage
		if(slotID == 1) {
			if(filter.hasSubStat(rune, StatEnum.ATKPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.SPD)) {
				counter++;
			}
			if(counter >= 3) {
				syn = true;
			}
			
		}else if(slotID == 2 || slotID == 6) {
			if(filter.hasPrimaryStat(rune, StatEnum.ATKPERCENT)){
				if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.SPD)) {
					counter++;
				}
				if(counter >= 3) {
					syn = true;
				}
			}
		}else if(slotID == 4) {
			if(filter.hasPrimaryStat(rune, StatEnum.CRITDAMAGE)) {
				if(filter.hasSubStat(rune, StatEnum.ATKPERCENT)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.SPD)) {
					counter++;
				}
				if(counter >= 2) {
					syn = true;
				}
			}
		}else if(slotID == 3){
			if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.SPD)) {
				counter++;
			}
			if(counter >= 3) {
				syn = true;
			}
			
		}else {
			if(filter.hasSubStat(rune, StatEnum.ATKPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.SPD)) {
				counter++;
			}
			if(counter >= 3) {
				syn = true;
			}
		}		
		return syn;
	}
	
	
	public boolean checkSupport(Rune rune) {
		boolean syn = false;
		int slotID = rune.getRuneSlot();
		int counter = 0;
		
		//if slot 1, 3, 5, check for tanky stats, don't double up on acc/res
		if((slotID == 1 || slotID == 3 || slotID == 5) && filter.hasSubStat(rune, StatEnum.SPD)) {
			counter++;
			if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.ACCURACY) ||filter.hasSubStat(rune, StatEnum.RESISTANCE)) {
				counter++;
			}

			if(counter >= 3) {
				syn = true;
			}
		}else if(slotID == 2 || slotID == 6 || slotID == 4) {
			if(filter.hasPrimaryStat(rune, StatEnum.SPD) || filter.hasPrimaryStat(rune, StatEnum.DEFPERCENT) || filter.hasPrimaryStat(rune, StatEnum.HPPERCENT)){
				if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.SPD)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.RESISTANCE)||filter.hasSubStat(rune, StatEnum.ACCURACY)) {
					counter++;
				}
				if(counter >= 3) {
					syn = true;
				}
			}
		}		
		return syn;
	}
	
	public boolean checkBruiser(Rune rune) {
		boolean syn = false;
		int slotID = rune.getRuneSlot();
		int counter = 0;
		
		//if slot 1, 3, 5, check for tanky stats and dmg
		if((slotID == 1 || slotID == 3 || slotID == 5) && filter.hasSubStat(rune, StatEnum.SPD)) {
			counter++;
			if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.ATKPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
				counter++;
			}

			if(counter >= 4) {
				syn = true;
			}
		}else if(slotID==4 && filter.hasPrimaryStat(rune, StatEnum.CRITDAMAGE)) {
			if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.ATKPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.SPD)) {
				counter++;
			}
			if(counter >= 4) {
				syn = true;
			}
		}else if(slotID == 2 || slotID == 4){
			if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.ATKPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.SPD)) {
				counter++;
			}
			if(counter >= 4) {
				syn = true;
			}
		}
		return syn;
	}
	
	public boolean checkDefAttacker(Rune rune) {
		boolean syn = false;
		int slotID = rune.getRuneSlot();
		int counter = 0;
		
		//if slot 1, check for atk%, spd, crit rate, crit damage
		if(slotID == 3 && filter.hasSubStat(rune, StatEnum.SPD)) {
			counter += 1;
			if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
				counter++;
			}
			if(counter >= 3) {
				syn = true;
			}
			
		}else if((slotID == 2 || slotID == 6) && filter.hasSubStat(rune, StatEnum.SPD)) {
			if(filter.hasPrimaryStat(rune, StatEnum.DEFPERCENT)){
				counter += 1;
				if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
					counter++;
				}
				if(counter >= 3) {
					syn = true;
				}
			}
		}else if(slotID == 4 && filter.hasSubStat(rune, StatEnum.SPD) ) {
			counter++;
			if(filter.hasPrimaryStat(rune, StatEnum.CRITDAMAGE)) {
				if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
					counter++;
				}
				if(counter >= 2) {
					syn = true;
				}
			}
		}else if(slotID == 1 && filter.hasSubStat(rune, StatEnum.SPD)){
			counter++;
			if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
				counter++;
			}
			if(counter >= 3) {
				syn = true;
			}
			
		}else {
			if(filter.hasSubStat(rune, StatEnum.SPD)) {
				counter++;
				if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
					counter++;
				}
				if(counter >= 3) {
					syn = true;
				}
			}
		}		
		return syn;
	}
	
	public boolean checkHPAttacker(Rune rune) {
		boolean syn = false;
		int slotID = rune.getRuneSlot();
		int counter = 0;
		
		//if slot 1, check for atk%, spd, crit rate, crit damage
		if((slotID == 1 || slotID == 3 || slotID == 5) && filter.hasSubStat(rune, StatEnum.SPD)) {
			counter += 1;
			if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
				counter++;
			}
			if(counter >= 3) {
				syn = true;
			}
			
		}else if((slotID == 2 || slotID == 6) && filter.hasSubStat(rune, StatEnum.SPD) && filter.hasPrimaryStat(rune, StatEnum.HPPERCENT)) {
			counter += 1;
			if(filter.hasSubStat(rune, StatEnum.CRITDAMAGE)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
				counter++;
			}
			if(counter >= 3) {
				syn = true;
			}
		}else if(slotID == 4 && filter.hasSubStat(rune, StatEnum.SPD) ) {
			counter++;
			if(filter.hasPrimaryStat(rune, StatEnum.CRITDAMAGE)) {
				if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
					counter++;
				}
				if(filter.hasSubStat(rune, StatEnum.CRITRATE)) {
					counter++;
				}
				if(counter >= 2) {
					syn = true;
				}
			}
		}
		return syn;
	}
	
	public boolean checkAD(Rune rune) {
		boolean syn = false;
		int slotID = rune.getRuneSlot();
		int counter = 0;
		if((slotID == 1 || slotID == 3 || slotID == 5) && filter.hasSubStat(rune, StatEnum.SPD)) {
			counter++;
			if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.RESISTANCE)){
				counter++;
			}

			if(counter >= 4) {
				syn = true;
			}
		}else if(slotID == 2 && filter.hasPrimaryStat(rune, StatEnum.SPD)) {
			if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.RESISTANCE)){
				counter++;
			}
			if(counter >= 3) {
				syn = true;
			}
		}else if((slotID == 4 || slotID == 6) && filter.hasSubStat(rune, StatEnum.SPD) && (filter.hasPrimaryStat(rune, StatEnum.HPPERCENT) || filter.hasPrimaryStat(rune, StatEnum.DEFPERCENT))) {
			if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.RESISTANCE)){
				counter++;
			}
			if(counter >= 2) {
				syn = true;
			}
		}
		
		
		
		return syn;
	}
	
	public boolean checkStripper(Rune rune) {
		boolean syn = false;
		int slotID = rune.getRuneSlot();
		int counter = 0;
		if((slotID == 1 || slotID == 3 || slotID == 5) && filter.hasSubStat(rune, StatEnum.SPD)) {
			counter++;
			if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.ACCURACY)){
				counter++;
			}

			if(counter >= 4) {
				syn = true;
			}
		}else if(slotID == 2 && filter.hasPrimaryStat(rune, StatEnum.SPD)) {
			if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.ACCURACY)){
				counter++;
			}
			if(counter >= 3) {
				syn = true;
			}
		}else if((slotID == 4 || slotID == 6) && filter.hasSubStat(rune, StatEnum.SPD) && 
				(filter.hasPrimaryStat(rune, StatEnum.HPPERCENT) || filter.hasPrimaryStat(rune, StatEnum.DEFPERCENT) || filter.hasPrimaryStat(rune, StatEnum.ACCURACY))) {
			if(filter.hasSubStat(rune, StatEnum.HPPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.DEFPERCENT)) {
				counter++;
			}
			if(filter.hasSubStat(rune, StatEnum.ACCURACY)){
				counter++;
			}
			if(counter >= 2) {
				syn = true;
			}
		}		
		return syn;
	}
	
}
