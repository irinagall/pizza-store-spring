package com.sparta.idg.pizzastore259;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component//something Spring can create via Dependency Injection
//Inversion of Control Container (IoC)
public class CustomCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("Hello from the Custom Command line Runner");
    }
}
