package com.github.frunoman.some;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("kenny")
public class Instrumentalist implements Performer {
    private Instrument instrument;
    private String song;


    public Instrumentalist() {
    }

    public void perform() {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    @Autowired
    @Qualifier("guitar")
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
