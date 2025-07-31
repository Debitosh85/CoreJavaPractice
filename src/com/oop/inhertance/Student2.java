/*
 * package com.oop.inhertance;
 * 
 * public class Student2 {
 * 
 * protected String name; protected int rollNumber;
 * 
 * 
 * public Student2(String name,int rollNumber) { super(); this.name = name;
 * this.rollNumber = rollNumber; }
 * 
 * public void displayDetails() { System.out.println("Student name is :"+name);
 * System.out.println("Student RollNumber is :"+rollNumber); }
 * 
 * public double calculatePecentage() {
 * 
 * return 0.0; } }
 * 
 * class ScienceStudent extends Student2 { private int physicsMark; private int
 * chemistryMark; private int mathMark; public ScienceStudent(String name, int
 * rollNumber, int physicsMark, int chemistryMark, int mathMark) { super(name,
 * rollNumber); this.physicsMark = physicsMark; this.chemistryMark =
 * chemistryMark; this.mathMark = mathMark; } public int getPhysicsMark() {
 * return physicsMark; } public void setPhysicsMark(int physicsMark) {
 * this.physicsMark = physicsMark; } public int getChemistryMark() { return
 * chemistryMark; } public void setChemistryMark(int chemistryMark) {
 * this.chemistryMark = chemistryMark; } public int getMathMark() { return
 * mathMark; } public void setMathMark(int mathMark) { this.mathMark = mathMark;
 * }
 * 
 * public void displayDetails() {
 * 
 * super.displayDetails(); System.out.println("Physics mark is :"+physicsMark);
 * System.out.println("Chemistry mark is :"+chemistryMark);
 * System.out.println("Math mark is "+mathMark); }
 * 
 * public double calculatePercentage() { double percent =
 * ((physicsMark+chemistryMark+mathMark)/3); return percent;
 * 
 * } }
 * 
 * class ArtsStudent extends Student2 { private int historyMark; private int
 * geographyMark; private int englishMark;
 * 
 * public ArtsStudent(String name,int rollNumber,int historyMark,int
 * geographyMark,int englishMark) { super(name,rollNumber); this.historyMark =
 * historyMark; this.geographyMark = geographyMark; this.englishMark =
 * englishMark; }
 * 
 * public int getHistoryMark() { return historyMark; }
 * 
 * public void setHistoryMark(int historyMark) { this.historyMark = historyMark;
 * }
 * 
 * public int getGeographyMark() { return geographyMark; }
 * 
 * public void setGeographyMark(int geographyMark) { this.geographyMark =
 * geographyMark; }
 * 
 * public int getEnglishMark() { return englishMark; }
 * 
 * public void setEnglishMark(int englishMark) { this.englishMark = englishMark;
 * }
 * 
 * 
 * }
 * 
 * 
 */