package com.github.frunoman.some;

import com.github.frunoman.knights.Knight;
import com.github.frunoman.knights.SavePrincessQuest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");
        Performer performer = (Performer) context.getBean("kenny");
        performer.perform();
    }
}
