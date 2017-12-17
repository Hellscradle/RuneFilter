package rune_filter;

import java.util.List;

import rune.*;
import rune_importer.RuneImporter;



public class Driver {

	public static void main(String[] args) {
		RuneImporter ri = new RuneImporter("ResourcesFolder/HellscradleNew.json");
		List<Rune> runeList = ri.runeList;
		Filter filter = new Filter();
		
		
		for(int i=0; i< runeList.size();i++) {
			boolean bool = filter.isRarity(runeList.get(i), Rarity.LEGEND);
			if(bool) {
				System.out.println(runeList.get(i).getRuneRarity().toString());
			}
		}
		
	}

}
