package main_pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import rune.Rune;
import rune_filter.PredefinedFilter;
import rune_importer.RuneImporter;
import rune_runtime.LiveRuneReader;

public class CLI {

	Scanner sc;
	String jsonLocation;
	String csvLocation;
	boolean usePredefined;
	String filterFile;
	PredefinedFilter filter;
	
	public CLI(){
		sc = new Scanner(System.in);
		usePredefined = true;
		filter = new PredefinedFilter();
	}
	
	public CLI(String jsonLoc, String csvLoc, boolean predefined, String filterFile) {

	}
	
	public CLI(String jsonLoc, String csvLoc) {
		sc = new Scanner(System.in);
		this.jsonLocation = jsonLoc;
		this.csvLocation = csvLoc;
		usePredefined = true;
		filter = new PredefinedFilter();
	}
	
	
	public void runDisplay() {
		System.out.println("Welcome to Hellscradle's Rune Filter!");
		displayMainMenu();
	}
	
	private void displayMainMenu() {
		System.out.println("--------------------------");
		System.out.println("1 - Runtime Filter");
		System.out.println("2 - Analyze Runes");
		System.out.println("3 - Configure Settings");
		System.out.println("4 - Switch to GUI");
		System.out.println("0 - Exit");
		int mode = sc.nextInt();
		sc.nextLine();
		
		switch(mode) {
			case 1:
				runtimeRuneFilter();
				break;
			case 2:
				analyzeSettings();
				break;
			case 3:
				configureSettings();
				break;
			case 4:
				System.out.println("GUI not yet implemented.");
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Please enter a valid entry");
				displayMainMenu();
				break;
		}
		
	}
	
	private void runtimeRuneFilter() {
		System.out.println("----Runtime Filter Settings----");
		System.out.println("1 - Show Minimal");
		System.out.println("2 - Show Totals");
		System.out.println("3 - Show All");
		System.out.println("0 - Back");
		int displayLevel = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Starting Live Runtime Filter");
		LiveRuneReader lrr = new LiveRuneReader(true,false,displayLevel);
		lrr.startTimer();
	}
	
	
	private int settingsView() {
		int viewRunes = 0;
		System.out.println("---Analyzer-Settings-----");
		System.out.println("1 - Show All but Mark Them");
		System.out.println("2 - Show Runes to Keep");
		System.out.println("3 - Show Runes to Sell");
		System.out.println("0 - Back");
		switch(sc.nextInt()) {
			case 1:
				viewRunes = 1;
				break;
			case 2:
				viewRunes = 2;
				break;
			case 3:
				viewRunes = 3;
				break;
			case 0:
				viewRunes = 0;
				break;
			default:
				System.out.println("Please enter a valid number");
				break;
		}
		sc.nextLine();
		return viewRunes;
	}
	
	private int settingsEquipped() {
		int equippedView = 0;
		System.out.println("1 - Include Equipped Runes");
		System.out.println("2 - Show Only Inventory Runes");
		System.out.println("0 - Back");
		switch(sc.nextInt()) {
		case 1:
			equippedView = 1;
			break;
		case 2:
			equippedView = 2;
			break;
		case 0:
			equippedView = 0;
			break;
		default:
			System.out.println("Please enter a valid number");
			break;
		}
		sc.nextLine();
		
		return equippedView;
	}
	
	private void analyzeSettings() {
		int runeView = settingsView();
		int equippedView = settingsEquipped();
		if(runeView == 0 || equippedView == 0) {analyzeSettings();}
		analyzeRunes(runeView,equippedView);
	}
	
	private boolean filterCheck(Rune rune) {
		if(filter.checkRune(rune) && filter.checkSynergy(rune)) {
			return true;
		}else {
			return false;
		}
	}
	
	private void analyzeRunes(int view, int equipped) {
		System.out.println("-----Analyzing Runes-----");
		RuneImporter ri = new RuneImporter(jsonLocation);
		List<Rune> runeList = ri.runeList;
		List<Rune> displayList = new ArrayList<Rune>();
		List<Rune> finalList = new ArrayList<Rune>();
		
		if(view == 1) {
			for(int i=0; i<runeList.size();i++) {
				displayList.add(runeList.get(i));
			}
		}else if(view == 2) {
			System.out.println("-----Runes to Keep-----");
			for(int i=0; i<runeList.size();i++) {
				if(filterCheck(runeList.get(i))) {
					displayList.add(runeList.get(i));
				}
			}
		}
		else if(view == 3) {
			System.out.println("-----Runes to Sell-----");
			for(int i=0; i<runeList.size();i++) {
				if(!filterCheck(runeList.get(i))) {
					displayList.add(runeList.get(i));
				}
			}
		}
		
		
		
		if(equipped == 2) {
			System.out.println("Display unequipped Runes");
			for(int i=0;i<displayList.size();i++) {
				if(!displayList.get(i).getEquipped()) {
					finalList.add(displayList.get(i));
				}
			}
			for(int i=0; i<finalList.size();i++) {
				finalList.get(i).displayRune();
			}
		}else {
			System.out.println("Display All");
			for(int i=0; i<displayList.size();i++) {
				displayList.get(i).displayRune();
			}
		}
		
	}
	
	private void configureSettings() {
		System.out.println("1 - Set json account file location");
		System.out.println("2 - Set csv file for live reader");
		System.out.println("3 - Filter Settings");
		System.out.println("0 - Back");
		int x = sc.nextInt();
		sc.nextLine();

		String c;
				
		switch(x) {
			case 1:
				System.out.println("Enter File Location: ");
				String jsonTemp = sc.nextLine();
				System.out.println("json location is: " + jsonTemp);
				System.out.println("Is this correct?(y/n)");
				c = sc.nextLine();
				if(c.charAt(0) == 'y' || c.charAt(0) == 'Y') {
					System.out.println("Location Saved");
					jsonLocation = jsonTemp;
					configureSettings();
				}else {
					System.out.println("Location not Saved");
					configureSettings();
				}		
				break;
			case 2:
				System.out.println("Enter File Location: ");
				String csvTemp = sc.nextLine();
				System.out.println("csv location is: " + csvTemp);
				System.out.println("Is this correct?(y/n)");
				c = sc.nextLine();
				if(c.charAt(0) == 'y' || c.charAt(0) == 'Y') {
					System.out.println("Location Saved");
					csvLocation = csvTemp;
					configureSettings();
				}else {
					System.out.println("Location not Saved");
					configureSettings();
				}		
				break;
			case 3:
				pickFilter();
				break;
			case 0:
				displayMainMenu();
				break;
			default:
				System.out.println("Please enter a valid entry");
				configureSettings();
				break;
		}
		
	}
	
	private void pickFilter() {
		System.out.println("1 - Predifined Filter");
		System.out.println("2 - Filter File - pick location");
		System.out.println("0 - Back");
		int x = sc.nextInt();
		sc.nextLine();
		switch(x) {
			case 1:
				break;
			case 2:
				break;
			case 0:
				configureSettings();
				break;
			default:
				System.out.println("Please enter a valid entry");
				pickFilter();
				break;
		}

	}
	
	
}
