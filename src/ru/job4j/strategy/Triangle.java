package ru.job4j.strategy;

import java.util.StringJoiner;

public class Triangle implements Shape{
    @Override
    public String draw(){
        StringJoiner figure = new StringJoiner(System.lineSeparator());
        figure.add("    +    ");
        figure.add("   +  +  ");
        figure.add("  +    + ");
        figure.add(" ++++++++");
        return figure.toString();
    }
}
