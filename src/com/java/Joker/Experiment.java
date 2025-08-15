package com.java.Joker;

public class Experiment {

    private String name;
    private int id;
    private String roll;
    private String adress;

    public Experiment(String name, int id, String roll, String adress) {
        this.name = name;
        this.id = id;
        this.roll = roll;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getRoll() {
        return roll;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "Experiment [name=" + name + ", id=" + id + ", roll=" + roll + ", adress=" + adress + "]";
    }
}