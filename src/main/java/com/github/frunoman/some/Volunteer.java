package com.github.frunoman.some;

public class Volunteer implements Thinker {
    String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
