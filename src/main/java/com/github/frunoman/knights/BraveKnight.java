package com.github.frunoman.knights;

public class BraveKnight implements Knight{

    @Override
    public void doQuest(Quest quest) {
        quest.evaluate();
    }
}
