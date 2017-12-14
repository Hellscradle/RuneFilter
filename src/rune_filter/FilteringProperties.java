package rune_filter;

import rune.*;

public class FilteringProperties {
	
	public FilteringProperties() {
		
	}
	
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
}
