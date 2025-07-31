package com.inheritance.Has_A_Relation;

public class Demo2Main {
	
	
	public class Test {
		public static void main(String[] args) {
			System.out.print(new Demo2().x + new Demo2().y);
			Demo2 demo = new Demo2(30, 50);
			System.out.print(" " + demo.x + " " + demo.y + " " + (new Demo().x - demo.y));
		}
	}


}
