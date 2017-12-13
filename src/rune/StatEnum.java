package rune;

public enum StatEnum {
	ATKFLAT ("Flat Atk"),
	ATKPERCENT ("Atk %"),
	DEFFLAT ("Flat Def"),
	DEFPERCENT ("Def %"),
	HPFLAT ("Flat HP"),
	HPPERCENT ("HP %"),
	SPD ("Spd"),
	CRITRATE ("Crit Rate"),
	CRITDAMAGE ("Crit Damage"),
	RESISTANCE ("Res"),
	ACCURACY ("Acc"),
	BLANK ("None")
	;

private final String name;

StatEnum(String n){
	this.name = n;
}

public static StatEnum fromString(String str) {
	for (StatEnum se : StatEnum.values()) {
		if(se.toString().equals(str)) {
			return se;
		}
	}
	return null;
}

public String toString() {return this.name;}

}
