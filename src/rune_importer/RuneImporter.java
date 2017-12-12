package rune_importer;

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
	private Mapper mm;
	
	public RuneImporter(String filelocation){
		loadJSON(filelocation);
	}
	
	private void loadJSON(String filelocation) {
		//create the JSON Parser to open our JSON file
		//create the runelist that will contain all our runes
		//create the mapper so we can map what monsters have which runes
		JSONParser parser = new JSONParser();
		runeList = new ArrayList<Rune>();
		mm = new Mapper();
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
			mm = null;
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	//convert the JSON data to rune data and return that rune
	private Rune jsonToRune(JSONObject jsonRune) {
		Rune craftedRune = null;
		int id = (int) jsonRune.get("rune_id");
		int setid = (int) jsonRune.get("set_id");
		RuneType type = getSet((int)setid);
		
		
		
		
		return craftedRune;
	}
	
	private RuneType getSet(int setid) {
		RuneType t = null;
		
		return t;
	}
	
	
}
