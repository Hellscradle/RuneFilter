package rune_filter;

import java.util.List;

import rune.*;
import rune_importer.RuneImporter;
import rune_runtime.LiveRuneReader;



public class Driver {

	public static void main(String[] args) {
		/*RuneImporter ri = new RuneImporter("ResourcesFolder/HellscradleNew.json");
		List<Rune> runeList = ri.runeList;
		PredefinedFilter filter = new PredefinedFilter();
		
		for(int i=0; i<runeList.size();i++) {
			runeList.get(i).displayRune();
		}*/	
		
		LiveRuneReader lrr = new LiveRuneReader();
		lrr.startTimer();
	}
}