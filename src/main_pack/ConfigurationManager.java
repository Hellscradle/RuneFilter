package main_pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConfigurationManager {
	String location;
	String csv;
	
	public ConfigurationManager() {
		if(checkForConfFile()) {
			try {
				loadConfFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				createConfFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String getLocation() {return location;}
	public String getCSV() {return csv;}

	public boolean checkForConfFile() {
		File tmp = new File("DefaultSettings.txt");
		return tmp.exists();
	}
	
	private void createConfFile() throws IOException {
		File file = new File("DefaultSettings.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		file.createNewFile();
		writer.append("##### Location of account .json file #####\n");
		writer.append("C:\\Programs\\RuneFilter\\Account-19884943.json\n");
		writer.append("##### Location of account .csv live runtime file #####\n");
		writer.append("C:\\Programs\\RuneFilter\\Account-19884943-runs.csv");
		
		writer.close();
		}
		
	
	private void loadConfFile() throws IOException {
		File file = new File("DefaultSettings.txt");
		FileReader reader = new FileReader(file);
		BufferedReader in = new BufferedReader(reader);
		in.readLine();
		location = in.readLine();
		in.readLine();
		csv = in.readLine();
		in.close();
	}
}
