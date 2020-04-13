package ru.job4j.poly;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        freshman.meet();
        freshman.beFreshman();
        System.out.println("После приведения freshman к типу Student");
        Student stu = freshman;
        stu.meet();
        stu.beStudent();
        Object obj = freshman;
    }
}
