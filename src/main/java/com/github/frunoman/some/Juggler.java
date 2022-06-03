package com.github.frunoman.some;

public class Juggler implements Performer{
    private int beanBugs = 3;

    public Juggler(int beanBugs) {
        this.beanBugs = beanBugs;
    }

    public Juggler() {
    }

    @Override
    public void perform() {
        System.out.println("JUGGLE "+beanBugs+" BEANS");
    }
}
