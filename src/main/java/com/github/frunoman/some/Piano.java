package com.github.frunoman.some;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Piano implements Instrument {
    public Piano() {
    }
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}