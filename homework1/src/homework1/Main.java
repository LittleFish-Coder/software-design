package homework1;

public class Main {
	public static void main(String[] args) {
//		Animal myDog = new Dog();
//		Animal myCat = new Cat();
//		Animal mySheep = new Sheep();
//		Animal[] animals = {myDog, myCat, mySheep};
		
		Animal[] animals = {new Dog(), new Cat(), new Sheep()};
		
		// iterate the animal list
		for(Animal animal: animals) {
			animal.sound();
		}
	}
}
