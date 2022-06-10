package com.another.some;

import com.another.some.evaluators.Artist;
import com.another.some.evaluators.ExampleBean;
import com.another.some.interfaces.Evaluator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.another.some")
public class Main {

    @Bean
    public ExampleBean exampleBean() {
        return new ExampleBean();
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        Evaluator evaluator = (Evaluator) context.getBean(Artist.class);
        evaluator.evaluate();

        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

    }
}
