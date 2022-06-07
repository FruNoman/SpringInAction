package com.github.frunoman.some;

import org.springframework.stereotype.Component;

import java.util.Collection;

@Component("tonny")
public class OneManBand implements Performer {
    private Collection<Instrument> instruments;

    public OneManBand() {
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments; // Внедрение коллекции инструментов
    }

    @Override
    public void perform() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
