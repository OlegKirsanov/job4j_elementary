package ru.job4j.encapsulation;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Михайло Ломоносов");
        student.setGroup("СГЛА-1731-1");
        student.setEntered(new Date());
        System.out.println("Студент " + student.getFullName() + " поступил в Академию в " + student.getEntered() + " и учение проходит в группе " + student.getGroup());
    }
}
