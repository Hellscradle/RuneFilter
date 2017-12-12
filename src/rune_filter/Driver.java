package rune_filter;

import rune.Rarity;
import rune.Rune;
import rune.RuneType;
import rune.Stat;
import rune.StatEnum;
import rune_importer.RuneImporter;

public class Driver {

	public static void main(String[] args) {
		RuneImporter ri = new RuneImporter("JSONFolder/hellsmainupload.json");
		ri.output();
	}

}
