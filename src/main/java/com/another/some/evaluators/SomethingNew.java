package com.another.some.evaluators;

import com.another.some.interfaces.SomeInterface;
import org.springframework.stereotype.Component;

@Component
public class SomethingNew implements SomeInterface {
    @Override
    public void doSome() {
        System.out.println("Do something NEW !!!!!");
    }
}
