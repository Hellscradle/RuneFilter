package rune;

public enum StatEnum {
	ATKFLAT ("FlatAtk"),
	ATKPERCENT ("Atk %"),
	DEFFLAT ("FlatDef"),
	DEFPERCENT ("Def %"),
	HPFLAT ("FlatHP"),
	HPPERCENT ("HP %"),
	SPD ("Spd"),
	CRITRATE ("CritRate"),
	CRITDAMAGE ("CritDamage"),
	RESISTANCE ("Res"),
	ACCURACY ("Acc"),
	BLANK ("None")
	;

private final String name;

StatEnum(String n){
	this.name = n;
}

public String toString() {return this.name;}

}
