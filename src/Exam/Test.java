package Exam;

class Logical1 {

    final static int a; // Blank static final field

    static {
        m1();
        a = 100;
        System.out.println("User Value :" + a);
    }

    public static void m1() {
        System.out.println("Default Value :" + a);
    }

}

public class Test {
    public static void main(String[] args) {
        System.out.println("a value is :" + Logical1.a);
    }
}