package OopsAssessment;

class Animals{
	public void AnimalShouts(){
		System.out.println("Animals are \n 1.Dog \n 2.Horse \n 3.Cat \n Makes Different Noises");

	}
}
class Dog extends Animals{

	public void AnimalShouts() {
		System.out.println("Dog Sounds : WOW WOW");
	}

}
class Horse extends Animals{

	public void AnimalShouts() {
		System.out.println("Horse Sounds : MEAH MEAH");
	}

}
class Cat extends Animals{

	public void AnimalShouts() {
		System.out.println("Cat Sounds : MEOW MEOW");
	}

}

public class Animal {
	public static void main(String[] args) {
		Animals As = new Animals();
		Animals dg = new Dog();
		Animals Hs = new Horse();
		Animals Ca = new Cat();
		As.AnimalShouts();
		dg.AnimalShouts();
		Hs.AnimalShouts();
		Ca.AnimalShouts();
	}

}
