package com.github.frunoman.some;

public class PoeticJuggler extends Juggler{
    private Poem poem;

    public PoeticJuggler(int beanBugs, Poem poem) {
        super(beanBugs);
        this.poem = poem;
    }

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public void perform() {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
