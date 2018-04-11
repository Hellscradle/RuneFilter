package rune_runtime;

public class LiveParser {

	public LiveParser() {
		
	}
	
	public String[] parseValue(String str, String separator) {
		String[] parsed = str.split(separator);
		return parsed;
	}
	
}
