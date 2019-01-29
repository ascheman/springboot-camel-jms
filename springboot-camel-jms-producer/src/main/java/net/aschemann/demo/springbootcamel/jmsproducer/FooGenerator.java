package net.aschemann.demo.springbootcamel.jmsproducer;

import org.apache.camel.CamelContext;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class FooGenerator {

    private int count = 1;

    public String generateFoo(CamelContext camelContext) {
        return "Data #"+count;
    }

}
