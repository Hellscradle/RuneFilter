package rune_runtime;

import java.util.*;
import java.io.*;

import rune.*;


public class LiveRuneReader {

	private int symbolH;
	private int symbolT;
	private int symbolC;
	private int mana;
	private int manaFromSelling;
	private int manaTotal;
	private int energy;
	private int crystals;
	private int runePieces;
	private int shapeShifting;
	private int unknownScrolls;
	private int mysticScrolls;
	private int rainbow2;
	private int rainbow3;	
	
	private boolean isRune;
	private Rune currentRune;
	private int runeTotal;
	private int runeKept;
	
	public LiveRuneReader() {
		symbolH = 0;
		symbolT = 0;
		symbolC = 0;
		mana = 0;
		manaFromSelling = 0;
		manaTotal = 0;
		energy = 0;
		crystals = 0;
		runePieces = 0;
		shapeShifting = 0;
		unknownScrolls = 0;
		mysticScrolls = 0;
		rainbow2 = 0;
		rainbow3 = 0;
		isRune = false;
		currentRune = null;
	}
	
	TimerTask task = new LiveChangeCheck(new File("D:/Programs/SW Data/Hellscradle-17090016-runs.csv")) {
		protected void onChange(File file) {
			try {
				String[] lastDrop;
				LiveParser lp = new LiveParser();
				lastDrop = lp.parseValue(getLastLine(file),",");
				logType(lastDrop[7]);
				if(isRune) {
					currentRune = makeRune(lastDrop);
				}
				

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
	
	private void logType(String str) {
		//case for each drop type
		switch(str) {
			case "Rune":
				isRune = true;
				break;
			case "Symbol of Transcendence x4":
				symbolT += 4;
				isRune = false;
				break;
			case "Symbol of Transcendence x5":
				symbolT += 5;
				isRune = false;
				break;
			case "Symbol of Transcendence x6":
				symbolT += 5;
				isRune = false;
				break;
			case "Symbol of Transcendence x7":
				symbolT += 7;
				isRune = false;
				break;
			case "Symbol of Transcendence x8":
				symbolT += 8;
				isRune = false;
				break;
			case "Symbol of Transcendence x9":
				symbolT += 9;
				isRune = false;
				break;
			case "Symbol of Transcendence x10":
				symbolT += 10;
				isRune = false;
				break;
			case "Symbol of Transcendence x11":
				symbolT += 11;
				isRune = false;
				break;
			case "Symbol of Transcendence x12":
				symbolT += 12;
				isRune = false;
				break;
			case "Symbol of Harmony x4":
				symbolH += 4;
				isRune = false;
				break;
			case "Symbol of Harmony x5":
				symbolH += 5;
				isRune = false;
				break;
			case "Symbol of Harmony x6":
				symbolH += 6;
				isRune = false;
				break;
			case "Symbol of Harmony x7":
				symbolH += 7;
				isRune = false;
				break;
			case "Symbol of Harmony x8":
				symbolH += 8;
				isRune = false;
				break;
			case "Symbol of Harmony x9":
				symbolH += 9;
				isRune = false;
				break;
			case "Symbol of Harmony x10":
				symbolH += 10;
				isRune = false;
				break;
			case "Symbol of Harmony x11":
				symbolH += 11;
				isRune = false;
				break;
			case "Symbol of Harmony x12":
				symbolH += 12;
				isRune = false;
				break;
			case "Symbol of Chaos x4":
				symbolC += 4;
				isRune = false;
				break;
			case "Symbol of Chaos x5":
				symbolC += 5;
				isRune = false;
				break;
			case "Symbol of Chaos x6":
				symbolC += 6;
				isRune = false;
				break;
			case "Symbol of Chaos x7":
				symbolC += 7;
				isRune = false;
				break;
			case "Symbol of Chaos x8":
				symbolC += 8;
				isRune = false;
				break;
			case "Symbol of Chaos x9":
				symbolC += 9;
				isRune = false;
				break;
			case "Symbol of Chaos x10":
				symbolC += 10;
				isRune = false;
				break;
			case "Symbol of Chaos x11":
				symbolC += 11;
				isRune = false;
				break;
			case "Symbol of Chaos x12":
				symbolC += 12;
				isRune = false;
				break;
			case "Rainbowmon 2":
				rainbow2 += 1;
				isRune = false;
				break;
			case "Rainbowmon 3":
				rainbow3 += 1;
				isRune = false;
				break;
			case "Rune Pieces x8":
				runePieces += 8;
				isRune = false;
				break;
			case "Rune Pieces x9":
				runePieces += 9;
				isRune = false;
				break;
			case "Rune Pieces x10":
				runePieces += 10;
				isRune = false;
				break;
			case "Rune Pieces x11":
				runePieces += 11;
				isRune = false;
				break;
			case "Rune Pieces x12":
				runePieces += 12;
				isRune = false;
				break;
			case "Shapeshifting Stone x2":
				shapeShifting += 2;
				isRune = false;
				break;
			case "Shapeshifting Stone x3":
				shapeShifting += 3;
				isRune = false;
				break;
			case "Unknown Scroll x9":
				unknownScrolls += 9;
				isRune = false;
				break;
			case "Unknown Scroll x10":
				unknownScrolls += 10;
				isRune = false;
				break;
			case "Unknown Scroll x11":
				unknownScrolls += 11;
				isRune = false;
				break;
			case "Unknown I fought a tScroll x12":
				unknownScrolls += 12;
				isRune = false;
				break;
			case "Mystical Scroll x1":
				mysticScrolls += 1;
				isRune = false;
				break;
			default:
				throw new IllegalArgumentException("No data for this type:" + str);
		}
	}
	
	private Rune makeRune(String[] str) {
		Rune madeRune = new Rune();
		
		//get the rune information
		//slot
		int madeSlot = 0;
		//rune type
		RuneType madeType = null;
		//rune rarity
		Rarity madeRarity = null;
		//primary stat
		Stat madePrim = null;
		//implicit
		Stat madeImp = null;
		//List for subs
		List<Stat> stats = new ArrayList<Stat>();
		//sub 1
		Stat madeS1 = null;
		//sub 2
		Stat madeS2 = null;;
		//sub 3
		Stat madeS3 = null;;
		//sub 4
		Stat madeS4 = null;;
		//rune price
		int madePrice = 0;
		
		stats.add(madeS1);
		stats.add(madeS2);
		stats.add(madeS3);
		stats.add(madeS4);
		
		madeRune = new Rune(0,madeSlot,madeType,madeRarity,madeRarity,0,0,
				madePrim,madeImp,stats,
				false,"",madePrice,false);
		
		return madeRune;
	}
	
	public void showRunningTotals() {
		System.out.println("Energy from drops: " + energy);
		System.out.println("Crystals from drops: " + crystals);
		System.out.println("Mana from drops: " + mana);
		System.out.println("Mana from selling runes: " + manaFromSelling );
		System.out.println("Total mana: " + manaTotal);
		System.out.println("Unknown Scrolls: " + unknownScrolls);
		System.out.println("Mystical Scrolls: " + mysticScrolls);
		System.out.println("Symbols of Harmony: " + symbolH);
		System.out.println("Symbols of Transcendence: " + symbolT);
		System.out.println("Symbols of Chaos: " + symbolC);
		System.out.println("Rune Pieces: " + runePieces);
		System.out.println("Shape Shifting Stones: " + shapeShifting);
		System.out.println("3-Star Rainbowmons: " + rainbow3);
		System.out.println("2-Star Rainbowmons: " + rainbow2);
		System.out.println("Rune Drops: " + runeTotal);
		System.out.println("Runes Kept: " + runeKept);
	}
	
}
