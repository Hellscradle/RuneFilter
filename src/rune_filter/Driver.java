package rune_filter;

import java.util.List;

import rune.*;
import rune_importer.RuneImporter;



public class Driver {

	public static void main(String[] args) {
		RuneImporter ri = new RuneImporter("ResourcesFolder/HellscradleNew.json");
		List<Rune> runeList = ri.runeList;
		PredefinedFilter filter = new PredefinedFilter();
		EfficiencyCalculator eff = new EfficiencyCalculator();
		
		for(int i=0; i<runeList.size();i++) {
			System.out.println(runeList.get(i).getEquippedTo());
			System.out.println("Efficiency = " + eff.calcCurrent(runeList.get(i))*100f + "%");
		}
		
		
		
	}
}