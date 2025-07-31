package com.inheritance.Has_A_Relation;

//public class DemoMain {
//		public static void main(String[] args) {
//			System.out.print(new Demo().x + new Demo().y);
//			Demo demo = new Demo(20, 45);
//			System.out.print(" " + demo.x + " " + demo.y + " " + (new Demo().x - demo.y));
//		}
//	}

public class DemoMain {
	public static void main(String[] args) {
		System.out.print(new Demo().x + new Demo().y);
		Demo demo = new Demo(30, 50);
		System.out.print(" " + demo.x + " " + demo.y + " " + (new Demo().x - demo.y));
	}
}

