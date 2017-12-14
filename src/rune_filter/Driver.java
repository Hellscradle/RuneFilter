package rune_filter;

import java.util.List;

import rune.*;
import rune_importer.RuneImporter;

public class Driver {

	public static void main(String[] args) {
		RuneImporter ri = new RuneImporter("JSONFolder/HellscradleNew.json");
		List<Rune> runeList = ri.runeList;
		FilteringProperties filter = new FilteringProperties();
		
		
		for(int i=0; i< runeList.size();i++) {
			//runeList.get(i).displayRune();
			boolean hasSpeed = filter.hasSubStat(runeList.get(i), StatEnum.SPD);
			if(hasSpeed) {
				runeList.get(i).displayRune();
			}
		}
		
	}

}
