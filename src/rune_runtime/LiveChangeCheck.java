package rune_runtime;

import java.util.*;
import java.io.*;

public abstract class LiveChangeCheck extends TimerTask{

	private long timeStamp;
	private File file;
	
	public LiveChangeCheck(File file) {
		this.file = file;
		this.timeStamp = file.lastModified();
	}

	public final void run() {
		long newTimeStamp = file.lastModified();
		
		if(timeStamp != newTimeStamp) {
			timeStamp = newTimeStamp;
			onChange(file);
		}

	}
	
	protected abstract void onChange(File file);
}
