package com.github.frunoman.some;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("guitar")
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("DRIN DRIN DRIN");
    }
}
