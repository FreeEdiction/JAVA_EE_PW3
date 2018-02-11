package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Instrumentalist {
	
	public Instrumentalist() {}

	public void perform() {
		System.out.print("Playing " + " : ");
		song.sing();
		instrument.play();
	}
	
	@Autowired(required=false)
	private Song song;


	@Autowired(required=false)
	@Qualifier("piano")
	private Instrument instrument;
    
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	public void setSong(Song song) {
		this.song = song;
	}

}
