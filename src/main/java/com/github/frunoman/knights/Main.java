package com.github.frunoman.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = (Knight) context.getBean("braveKnight");
        knight.doQuest(new SavePrincessQuest());
    }
}
