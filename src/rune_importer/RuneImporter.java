package rune_importer;

import rune.Rarity;
import rune.Rune;
import rune.RuneType;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RuneImporter {
	public List<Rune> runeList;
	private long[] mapArray;
	private long[] mapArrayUnique;
	private Mapper mm = new Mapper();
	
	public RuneImporter(String filelocation){
		loadJSON(filelocation);
	}
	
	private void loadJSON(String filelocation) {
		//create the JSON Parser to open our JSON file
		//create the runelist that will contain all our runes
		//create the mapper so we can map what monsters have which runes
		JSONParser parser = new JSONParser();
		runeList = new ArrayList<Rune>();
		try 
		{
			//open the file and parse it all
			File tmp = new File(filelocation);
			Object obj = parser.parse(new FileReader(tmp));
			//grab the whole JSON Object file
			JSONObject fullJSON = (JSONObject) obj;
			
			//grab the non equipped runes from full file
			JSONArray runes = (JSONArray)fullJSON.get("runes");
			//grab the equipped runes from the full file
			JSONArray unitList = (JSONArray)fullJSON.get("unit_list");
			
			//initialize the monster map array for equipped runes
			//mapArray = unit id
			//mapArrayUnique = unit specific (i.e. two Lushens
			mapArray = new long[unitList.size()];
			mapArrayUnique = new long[unitList.size()];
			
			//loop through each monster and grab id info
			for(int i = 0; i < unitList.size();i++) {
				//grab the unit object in JSON form
				JSONObject tempRune = (JSONObject)unitList.get(i);
				
				//grab the monster's id info and save it to our array so
				//we can map them correctly later
				long unit_master_id = (long)tempRune.get("unit_master_id");
				long unit_id = (long)tempRune.get("unit_id");
				mapArray[i] = unit_master_id;
				mapArrayUnique[i] = unit_id;
				
				//Grab the rune data next from each monster
				JSONArray equippedRunes = (JSONArray) tempRune.get("runes");
				for(int x=0; x < equippedRunes.size();x++) {
					//grab each rune as we iterate over
					JSONObject equippedRuneData = (JSONObject) equippedRunes.get(x);
					//and add it to our total rune list
					runes.add(equippedRuneData);
				}
			}
			
			for(int i=0; i< runes.size();i++) {
				runeList.add(jsonToRune((JSONObject)runes.get(i)));
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	//convert the JSON data to rune data and return that rune
	private Rune jsonToRune(JSONObject jsonRune) {
		Rune craftedRune = null;
		long id = (long) jsonRune.get("rune_id");
		long setid = (long) jsonRune.get("set_id");
		RuneType type = getSet(setid);
		long grade = (long) jsonRune.get("class");
		long slot = (long) jsonRune.get("slot_no");
		long level = (long) jsonRune.get("upgrade_curr");
		long qualityid = (long) jsonRune.get("rank");
		Rarity rarity = getRarity(qualityid);
		long sellValue = (long) jsonRune.get("sell_value");
		
		//check if equipped and who it's equipped to
		long occupied = (long)jsonRune.get("occupied_type");
		boolean equipped;
		long equippedTo;
		String equippedName = "";
		
		if (occupied == 1){
			equipped = true;
			equippedTo = (long) jsonRune.get("occupied_id");
		}
		else{
			equipped = false;
			equippedTo = 0;
		}
		
		equippedName = findName(equippedTo);
		
		return craftedRune;
	}
	
	private String findName(long uniqueID) {
		String name = "";
		
		//convert if not awakened
		//convert if not awakened monster
		for(int y=0; y < mapArray.length; y++){
			if (mapArrayUnique[y] == uniqueID){
				name = mm.monsterIDmap.get(Long.toString(mapArray[y]));
				if (name == null){ 
					int converter = (int) mapArray[y];
					String element = getElement(converter % 10);
					int unawakened = converter/100;
					String monsterName = getMonsterType(Integer.toString(unawakened));
					name = element + " " + monsterName;
					}
			}
		}
		return name;
	}
	
	private RuneType getSet(long setid) {
		return RuneType.fromString(mm.runeSetMap.get((int)setid));
	}
	
	private Rarity getRarity(long q) {
		return Rarity.fromString(mm.runeQualityMap.get((int)q));
	}
	
	private String getElement(int n) {
		return mm.monsterElementMap.get(n);	
	}
	
	private String getMonsterType(String s) {
		return mm.monsterIDmap.get(s);
	}
	
	
	public void output() {
	}
	
}
