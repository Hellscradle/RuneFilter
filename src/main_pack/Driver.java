package main_pack;

public class Driver {
	
	public static void main(String[] args) {
		ConfigurationManager cm = new ConfigurationManager();
		
		CLI cli = new CLI(cm.getLocation(),cm.getCSV());
		cli.runDisplay();
	}
}
