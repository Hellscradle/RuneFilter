package rune;

public class Stat {
	private StatEnum statType;
	private float statValue;
	private boolean grinded;
	private float grindValue;
	private boolean enchanted;
	// 0 = main, 5 = implicit, 1-4 = substat location
	private int statLocation;
	
	public Stat(StatEnum type, float value, boolean grind, float grindValue, boolean enchanted,int statLocation){
		this.statType = type;
		this.statValue = value;
		this.grinded = grind;
		this.grindValue = grindValue;
		this.enchanted = enchanted;
		this.statLocation = statLocation;
	}
	
	public Stat(){
		
	}
	
	public void setType(StatEnum type) {
		this.statType = type;
	}
	
	public void setValue(float value) {
		this.statValue = value;
	}
	
	public void setGrind(boolean grind, float grindValue) {
		this.grinded = grind;
		this.grindValue = grindValue;
	}
	
	public void setEnchanted(boolean ench) { 
		this.enchanted = ench;
	}
	
	public void setStatLocation(int i) {
		this.statLocation = i;
	}
	
	public float getValue() {return statValue;}
	public StatEnum getType() {return statType;}
	public boolean getIsGrinded() {return grinded;}
	public float getGrindValue() {return grindValue;}
	public boolean getEnchanted() {return enchanted;}
	public int getStatLocation() {return statLocation;}
	
	//display the stats
	public void displayStat() {
		System.out.println(statType.toString()+ ", " + statValue);
		if(enchanted) {
			System.out.println("Enchanted: " + enchanted);
		}

		if (grinded) {
			System.out.println("Grind Stoned: " + grinded);
			System.out.println("Grindstone Amount: " + grindValue);
		}
	}
}
