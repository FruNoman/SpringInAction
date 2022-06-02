package com.github.frunoman;

public class BraveKnight implements Knight{

    @Override
    public void doQuest(Quest quest) {
        quest.evaluate();
    }
}
