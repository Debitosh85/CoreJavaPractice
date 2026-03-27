package Polymerphisim;

public class Animal {
	
	String species;
	
	public Animal(String species)
	{
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}
	
	public void makeSound()
	{
		System.out.println(" Generic Animal is Sounding ");
	}
	
	public Animal reProduce()
	{
		System.out.println("Generic animal reproduction");
		return new Animal("Unknown");
	}
	@Override
	public String toString() {
		return "Animal [species=" + species + "]";
	}
}

class Mamal extends Animal
{
	boolean hasFur;
	
	public Mamal(String specices,boolean hasFur)
	{
		super(specices);
		this.hasFur = hasFur;
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("Lion is Roaring");
	}
	
	@Override
	public Mamal reProduce()
	{
		System.out.println("Mammals give birth to live young");
		return new Mamal(super.getSpecies(),this.hasFur);
	}
	
	public void nurseYoung()
	{
		 System.out.println("Mamals nursing their young");
	}

	@Override
	public String toString() {
		return "Mamal [hasFur=" + hasFur + " " +"species="+species+"]";
	}
}

class Bird extends Animal
{
	boolean canFly;
	
	public Bird(String specices,boolean canFly)
	{
		super(specices);
		this.canFly = canFly;
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("Bird is Chirping");
	}
	
	public Bird reProduce()
	{
		System.out.println("Birds lay eggs as a means of reproduction.");
		return new Bird(super.getSpecies(),this.canFly);
	}
	
	public void buildNest()
	{
		System.out.println("birds building nests for their eggs.");
	}

	@Override
	public String toString() {
		return "Bird [canFly=" + canFly + " " + "species="+species+"]";
	}
}
