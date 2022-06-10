package com.another.some.evaluators;

import com.another.some.interfaces.Evaluator;
import com.another.some.interfaces.SomeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Artist implements Evaluator {
    @Autowired
    @Qualifier("somethingNew")
    private SomeInterface someInterface;

    public SomeInterface getSomeInterface() {
        return someInterface;
    }

    public void setSomeInterface(SomeInterface someInterface) {
        this.someInterface = someInterface;
    }

    @Override
    public void evaluate() {
        someInterface.doSome();
    }
}
