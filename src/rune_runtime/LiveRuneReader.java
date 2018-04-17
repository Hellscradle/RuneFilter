package rune_runtime;

import java.util.*;
import java.io.*;

import rune.*;
import rune_filter.PredefinedFilter;


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
	private int runs;
	
	private boolean isRune;
	private Rune currentRune;
	private int runeTotal;
	private int runeKept;
	private boolean keepRune;
	
	boolean predefinedFilter;
	boolean customFilter;
	PredefinedFilter defaultFilter;
	
	int displayLevel;
	
	public LiveRuneReader(boolean predefined, boolean custom, int displayLevel) {
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
		runs = 0;
		isRune = false;
		currentRune = null;
		predefinedFilter = predefined;
		customFilter = custom;
		runeTotal = 0;
		runeKept = 0;
		this.displayLevel = displayLevel;
		defaultFilter = new PredefinedFilter();		
	}
	
	TimerTask task = new LiveChangeCheck(new File("D:/Programs/SW Data/Hellscradle-17090016-runs.csv")) {
		protected void onChange(File file) {
			try {
				String[] lastDrop;
				//reset keep each rune
				keepRune = false;
				LiveParser lp = new LiveParser();
				lastDrop = lp.parseValue(getLastLine(file),",");
				
				logType(lastDrop[7]);
				if(isRune) {
					runeTotal += 1;
					currentRune = makeRune(lastDrop);
					//currentRune.displayRune();
					if(predefinedFilter) {
						if(defaultFilter.checkRune(currentRune)) {
							if(defaultFilter.checkSynergy(currentRune)) {
								keepRune = true;
							}
						}
					}
					if(customFilter) {
						
					}
					if(keepRune) {
						if(displayLevel == 1 || displayLevel == 3) {
							System.out.println("Keep");
						}
						runeKept += 1;
					}else {
						if(displayLevel == 1 || displayLevel == 3) {
							System.out.println("Sell");
						}
						manaFromSelling += currentRune.getSellValue();
					}
				}
				
				
				runs++;
				mana += Integer.parseInt(lastDrop[4]);
				manaTotal = manaFromSelling + mana;
				energy += Integer.parseInt(lastDrop[6]);
				crystals += Integer.parseInt(lastDrop[5]);
				if(displayLevel == 2 || displayLevel == 3) {showRunningTotals();}
				
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
		
		br.close();
		in.close();
		return lastLine;
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
			case "Rune Piece x8":
				runePieces += 8;
				isRune = false;
				break;
			case "Rune Piece x9":
				runePieces += 9;
				isRune = false;
				break;
			case "Rune Piece x10":
				runePieces += 10;
				isRune = false;
				break;
			case "Rune Piece x11":
				runePieces += 11;
				isRune = false;
				break;
			case "Rune Piece x12":
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
			case "Unknown Scroll x12":
				unknownScrolls += 12;
				isRune = false;
				break;
			case "Mystical Scroll":
				mysticScrolls += 1;
				isRune = false;
				break;
			case "":
				break;
			default:
				throw new IllegalArgumentException("No data for this type:" + str);
		}
	}
	
	private Rune makeRune(String[] str) {
		Rune madeRune;
		
		//get the rune information
		//grade
		int madeGrade = discoverGrade(str[8]);
		//slot
		int madeSlot = Integer.parseInt(str[12]);
		//rune type
		RuneType madeType = RuneType.fromString(str[10]);
		//rune rarity
		Rarity madeRarity;
		if(str[13].length()<7) {
			madeRarity = Rarity.fromString(str[13]);
		}else {
			madeRarity = Rarity.LEGEND;
		}
		
		//rune price
		int madePrice = Integer.parseInt(str[9]);
		
		//primary stat
		Stat madePrim = discoverStat(str[14],0);
		//implicit
		Stat madeImp = discoverStat(str[15],5);
		//sub 1
		Stat madeS1 = discoverStat(str[16],1);
		//sub 2
		Stat madeS2 = discoverStat(str[17],2);
		//sub 3
		Stat madeS3 = discoverStat(str[18],3);
		//sub 4
		Stat madeS4 = discoverStat(str[19],4);
		
		//List for subs
		List<Stat> stats = new ArrayList<Stat>();
		stats.add(madePrim);
		
		if(madeS1 != null) {
			stats.add(madeS1);
		}
		if(madeS2 != null) {
			stats.add(madeS2);
		}
		if(madeS3 != null) {
			stats.add(madeS3);
		}
		if(madeS4 != null) {
			stats.add(madeS4);
		}if(madeImp!= null) {
			stats.add(madeImp);
		}
		
		madeRune = new Rune(0,madeSlot,madeType,madeRarity,madeRarity,madeGrade,0,stats,
				false,"",madePrice,false);
		
		//rune efficiency
		EfficiencyCalculator ec = new EfficiencyCalculator();
		madeRune.setEfficiency(Float.parseFloat(str[11])/100f);
		madeRune.setMaxEfficiency(ec.calcMax(madeRune));
		
		return madeRune;
	}
	
	private Stat discoverStat(String str,int location) {
		Stat s = new Stat();
		if(str.equals("")) {
			return null;
		}
		String[] splitStr = str.split(" ");
		
		//ugly possibly refactor? grabbing the substring and parsing
		if(splitStr[0].equals("SPD")) {
			s= new Stat(StatEnum.SPD, Float.parseFloat(Character.toString(splitStr[1].charAt(splitStr[1].length()-1))),false,0,false, location);		
		}else if (splitStr[0].equals("ATK")) {
			if(splitStr[1].charAt(splitStr[1].length()-1) == '%') {
				s = new Stat(StatEnum.ATKPERCENT, Float.parseFloat(splitStr[1].substring(0,splitStr[1].length()-1)),false,0,false,location);
			}else {
				s = new Stat(StatEnum.ATKFLAT, Float.parseFloat(splitStr[1].substring(1)),false,0,false,location);
			}
		}else if (splitStr[0].equals("HP")) {
			if(splitStr[1].charAt(splitStr[1].length()-1) == '%') {
				s = new Stat(StatEnum.HPPERCENT, Float.parseFloat(splitStr[1].substring(0,splitStr[1].length()-1)),false,0,false,location);
			}else {
				s = new Stat(StatEnum.HPFLAT, Float.parseFloat(splitStr[1].substring(1)),false,0,false,location);
			}
		}else if (splitStr[0].equals("DEF")) {
			if(splitStr[1].charAt(splitStr[1].length()-1) == '%') {
				s = new Stat(StatEnum.DEFPERCENT, Float.parseFloat(splitStr[1].substring(0,splitStr[1].length()-1)),false,0,false,location);
			}else {
				s = new Stat(StatEnum.DEFFLAT, Float.parseFloat(splitStr[1].substring(1)),false,0,false,location);
			}
		}else if (splitStr[0].equals("Resistance")) {
			s = new Stat(StatEnum.RESISTANCE, Float.parseFloat(splitStr[1].substring(0,splitStr[1].length()-1)),false,0,false,location);
		}else if (splitStr[0].equals("Accuracy")) {
			s = new Stat(StatEnum.ACCURACY, Float.parseFloat(splitStr[1].substring(0,splitStr[1].length()-1)),false,0,false,location);
		}else if (splitStr[0].equals("CRI")) {
			if(splitStr[1].equals("Dmg")) {
				s = new Stat(StatEnum.CRITDAMAGE, Float.parseFloat(splitStr[2].substring(0,splitStr[2].length()-1)),false,0,false,location);
			}else {
				s = new Stat(StatEnum.CRITRATE, Float.parseFloat(splitStr[2].substring(0,splitStr[2].length()-1)),false,0,false,location);
			}
		}		
		return s;
	}
	
	private int discoverGrade(String str) {
		return Integer.parseInt(Character.toString(str.charAt(0))); 
	}
	
	public int getSymbolH() {return symbolH;}
	public int getSymbolT() {return symbolH;}
	public int getSymbolC() {return symbolC;}
	public int getMana() {return mana;}
	public int getCrystals() {return crystals;}
	public int getEnergy() {return energy;}
	public int getManaFromSelling() {return manaFromSelling;}
	public int getManaTotal() {return manaTotal;}
	public int getRunePieces() {return runePieces;}
	public int getShapeShifting() {return shapeShifting;}
	public int getRainbow2() {return rainbow2;}
	public int getRainbow3() {return rainbow3;}
	public int getUnknownScrolls() {return unknownScrolls;}
	public int getMysticalScrolls() {return mysticScrolls;}
	public Rune getLastRune() {return currentRune;}
	public int getRuneTotal() {return runeTotal;}
	public int getRunesKept() {return runeKept;}
	public int getRunesSold() {return (runeTotal-runeKept);}
	public int getRuns() {return runs;}
	
	public void showRunningTotalsOld() {
		System.out.println("-------------------------------------");
		System.out.println("Number of Runs: " + runs + "		Energy from drops: " + energy + "		Crystals from drops: " + crystals);
		System.out.println("Mana from drops: " + mana + "		Mana from selling runes: " + manaFromSelling + "	Total mana: " + manaTotal );
		System.out.println("Unknown Scrolls: " + unknownScrolls + "		Mystical Scrolls: " + mysticScrolls);
		System.out.println("Symbols of Harmony: " + symbolH + "		Symbols of Transcendence: " + symbolT + "	Symbols of Chaos: " + symbolC);
		System.out.println("Rune Pieces: " + runePieces + "			Shape Shifting Stones: " + shapeShifting);
		System.out.println("3-Star Rainbowmons: " + rainbow3 + " 		2-Star Rainbowmons: " + rainbow2);
		System.out.println("Rune Drops: " + runeTotal + " 			Runes Kept: " + runeKept);
		
		
	}
	
	public void showRunningTotals() {
				
		System.out.println("----------Running Totals-------------");
		System.out.println("Number of Runs: " + runs);
		System.out.println("------------------------");
		System.out.println("Symbols of Harmony: " + symbolH + "		Rune Drops: " + runeTotal);
		System.out.println("Symbols of Transcendence: " + symbolT + "	Runes Kept: " + runeKept);
		System.out.println("Symbols of Chaos: " + symbolC + "		Runes Sold: " + getRunesSold());
		System.out.println("");
		System.out.println("Energy from drops: " + energy + "		3-Star Rainbows: " + rainbow3);
		System.out.println("Crystals from drops: " + energy + "		2-Star Rainbows: " + rainbow2);
		System.out.println("");
		System.out.println("Unknown Scrolls: " + unknownScrolls + "		Rune Pieces: " + runePieces);
		System.out.println("Mystical Scrolls: " + mysticScrolls + "		Shapeshifting Stones: " + shapeShifting);
		System.out.println("");
		System.out.println("Mana from drops: " + mana);
		System.out.println("Mana from runes: " + manaFromSelling);
		System.out.println("Total Mana: " + manaTotal);
		System.out.println("------------------------");
	}
	
}
