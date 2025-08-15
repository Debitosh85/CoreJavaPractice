package Debitosh;

/*class Test
{
	final int x; //blank final field
	
	{
		m1();
		x = 100;
	}
	
	public void m1()
	{
		System.out.println("Default value :"+x);
	}	
	
}

public class BlankFinalFieldDemo1 {

	public static void main(String[] args)
	{
		Test t1 = new Test();
		System.out.println("User Value :"+t1.x);

	}

}*/


class Test {

	final int x;

	public Test() {
		x = 200;
		System.out.println("The Value of x is:" + x);
	}

	public Test(int y) {
		x = y;
		System.out.println("The Value of y is :" + y);
	}
}

public class BlankFinalField {
	public static void main(String[] args) {

		Test t = new Test();
		Test t1 = new Test(200);

	}
}