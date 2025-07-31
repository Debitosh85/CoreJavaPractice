package com.inheritance.Has_A_Relation;

public class TestMain {
		public static void main(String[] args) {
			Example e1 = new Example();
			Example e2 = new Example();
			e2.x = 25;
			e1.x = e2.y + 10;
			System.out.println(e1.x + " " + e1.y);
			System.out.println(e2.x + " " + e2.y);
		}
	
	}


