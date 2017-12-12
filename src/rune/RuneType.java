package rune;

public enum RuneType {
	ACCURACY ("Accuracy"),
	BLADE ("Blade"),
	DESPAIR ("Despair"),
	DESTROY ("Destroy"),
	DETERMINATION ("Determination"),
	ENDURE ("Endure"),
	ENERGY ("Energy"),
	ENHANCE ("Enhance"),
	FATAL ("Fatal"),
	FIGHT ("Fight"),
	FOCUS ("Focus"),
	GUARD ("Guard"),
	NEMESIS ("Nemesis"),
	RAGE ("Rage"),
	REVENGE ("Revenge"),
	SHIELD ("Shield"),
	SWIFT ("Swift"),
	TOLERANCE ("Tolerance"),
	VAMPIRE ("Vampire"),
	VIOLENT ("Violent"),
	WILL ("Will")
	;

	private final String type;
	
RuneType(String type){
	this.type = type;
}

public String toString() {return type;}
}
