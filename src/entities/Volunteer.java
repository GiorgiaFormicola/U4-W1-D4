package entities;

import interfaces.Worker;

public class Volunteer implements Worker {
    //ATTRIBUTES LIST
    private String name;
    private int age;
    private boolean CV;

    //COSTRUCTORS LIST
    public Volunteer(String name, int age, boolean CV) {
        this.name = name;
        this.age = age;
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println("The volunteer " + this.name + " has started his service");
    }
}
