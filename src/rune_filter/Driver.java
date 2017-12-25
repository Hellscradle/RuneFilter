package rune_filter;

import java.util.List;

import rune.*;
import rune_importer.RuneImporter;



public class Driver {

	public static void main(String[] args) {
		RuneImporter ri = new RuneImporter("ResourcesFolder/HellscradleNew.json");
		List<Rune> runeList = ri.runeList;
		PredefinedFilter filter = new PredefinedFilter();
		
		for(int i=0; i<runeList.size();i++) {
			if(filter.checkRune(runeList.get(i))) {
				if(filter.checkSynergy(runeList.get(i))){
					System.out.println("Rune is good");
					runeList.get(i).displayRune();
				}
			}
		}	
		
		
		
	}
}