package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() + System.lineSeparator() +"name : " + name + "," + System.lineSeparator() + "body : " + body + System.lineSeparator() + System.lineSeparator() + "}";
    }

    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        System.out.println(report.generate("name", "body"));
    }
}
