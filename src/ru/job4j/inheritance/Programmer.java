package ru.job4j.inheritance;

public class Programmer extends Engineer {
    String level;
    String stack;

    public String getLevel() {
        return level;
    }

    public String getStack() {
        return stack;
    }

    public Project support(Project project) {
        return project;
    }

}
