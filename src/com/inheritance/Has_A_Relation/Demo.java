package com.inheritance.Has_A_Relation;
//
//class Demo {
//	int x;
//	int y;
//	public Demo() {
//		x = 10;
//		y = x++;
//		x = this.y + this.x;
//		this.y = x + this.y;
//	}
//	public Demo(int x, int y) {
//		this.x = this.x + x;
//		this.y = this.x + y;
//	}
//}

class Demo {
	int x;
	int y;
	public Demo() {
		x = 10;
		y = x++;
	}
	public Demo(int x, int y) {
		this.x += this.x + x++;
		this.y -= this.x + --y;
	}
}