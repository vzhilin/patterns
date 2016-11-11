package ru.sberbank.gof.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Engine> engines = Arrays.asList(
                new StandardEngine(1300),
                new StandardEngine(1600),
                new TurboEngine(2000),
                new SuperGreenEngineAdapter(new SuperGreenEngine(1200))
        );

        engines.stream().forEach(System.out::println);
    }
}
