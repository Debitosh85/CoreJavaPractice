package com.inheritance.Has_A_Relation;

class Demo2 {
	int x;
	int y;
	public Demo2() {
		x = 10;
		y = x++;
	}
	public Demo2(int x, int y) {
		this.x += this.x + x++;
		this.y -= this.x + --y;
	}
}
