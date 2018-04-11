package rune_runtime;

import java.util.*;
import java.io.*;
import java.util.Timer;
import java.util.TimerTask;


public class LiveRuneReader {

	TimerTask task = new LiveChangeCheck(new File("D:/Programs/SW Data/Hellscradle-17090016-runs.csv")) {
		protected void onChange(File file) {
			try {
				String[] lastDrop;
				LiveParser lp = new LiveParser();
				lastDrop = lp.parseValue(getLastLine(file),",");
				
				/*for(int i=0; i<lastDrop.length;i++) {
					System.out.println(lastDrop[i]);
				}
				System.out.println("---------------");
				System.out.println("");*/
				//System.out.print(checkIfRune(lastDrop[7]));
				
				

			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	};
	Timer timer = new Timer();
		
	public void startTimer() {
		timer.schedule(task, 0, 4000);
		
	}
	
	public String getLastLine(File file) throws IOException {
		String lastLine = "";
		String tmp = "";
		FileInputStream in = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		while((tmp = br.readLine()) != null) {
			lastLine = tmp;
		}
		
		return lastLine;
	}
	
	private void logLine(String[] str) {
		
	}
	
	private String dropType(String str) {
		//case for each drop type
		String type = "";
		switch(str) {
			case "Rune":
				type = "Rune";
				break;
			case "Symbol of Transcendence x4":
				break;
			case "Symbol of Transcendence x5":
				break;
			case "Symbol of Transcendence x6":
				break;
			case "Symbol of Transcendence x7":
				break;
			case "Symbol of Transcendence x8":
				break;
			case "Symbol of Transcendence x9":
				break;
			case "Symbol of Transcendence x10":
				break;
			case "Symbol of Transcendence x11":
				break;
			case "Symbol of Transcendence x12":
				break;
			case "Symbol of Harmony x4":
				break;
			case "Symbol of Harmony x5":
				break;
			case "Symbol of Harmony x6":
				break;
			case "Symbol of Harmony x7":
				break;
			case "Symbol of Harmony x8":
				break;
			case "Symbol of Harmony x9":
				break;
			case "Symbol of Harmony x10":
				break;
			case "Symbol of Harmony x11":
				break;
			case "Symbol of Harmony x12":
				break;
			case "Symbol of Chaos x4":
				break;
			case "Symbol of Chaos x5":
				break;
			case "Symbol of Chaos x6":
				break;
			case "Symbol of Chaos x7":
				break;
			case "Symbol of Chaos x8":
				break;
			case "Symbol of Chaos x9":
				break;
			case "Symbol of Chaos x10":
				break;
			case "Symbol of Chaos x11":
				break;
			case "Symbol of Chaos x12":
				break;
			case "Rainbowmon 2":
				break;
			case "Rainbowmon 3":
				break;
			case "Rune Pieces x8":
				break;
			case "Rune Pieces x9":
				break;
			case "Rune Pieces x10":
				break;
			case "Rune Pieces x11":
				break;
			case "Rune Pieces x12":
				break;
			case "Shapeshifting Stone x2":
				break;
			case "Shapeshifting Stone x3":
				break;
			case "Unknown Scroll x9":
				break;
			case "Unknown Scroll x10":
				break;
			case "Unknown Scroll x11":
				break;
			case "Unknown Scroll x12":
				break;
			case "Mystical Scroll x1":
				break;
			default:
				throw new IllegalArgumentException("No data for this type:" + str);
		}
		return type;
	}
	
}
