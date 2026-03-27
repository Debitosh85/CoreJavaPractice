package Polymerphisim;

public class ZooSimulation {

	public static void main(String[] args) {
		
		Animal a1 = new Mamal("Lion",true);
		a1.reProduce();
		a1.makeSound();
		Mamal m1=(Mamal)a1;
		m1.nurseYoung();
		System.out.println(a1);
		
		System.out.println("----------------");
		
		Animal a2 = new Bird("Sparrow",true);
		a2.reProduce();
		a2.makeSound();
		Bird b = (Bird)a2;
        b.buildNest();	
        System.out.println(a2);
		
	}

}
