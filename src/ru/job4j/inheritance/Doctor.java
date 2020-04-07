package ru.job4j.inheritance;

public class Doctor extends Profession {
    String category;
    String speciality;
    String diagnose;

    public String getCategory() {
        return category;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String heal(Patient patient) {
        return diagnose;
    }
}
