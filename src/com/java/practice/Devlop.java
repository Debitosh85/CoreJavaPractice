package com.java.practice;

public class Devlop {

    int x;
    int y;
    String name;
    String id;
    String adress;

    public Devlop(int x, int y, String name, String id, String adress) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.id = id;
        this.adress = adress;
    }

    public void greet() {
        System.out.println("Hello i am a java devloper ");
    }

    @Override
    public String toString() {
        return " [x=" + x + ", y=" + y + ", name=" + name + ", id=" + id + ", adress=" + adress + "]";
    }

}
