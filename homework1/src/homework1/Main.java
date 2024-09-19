package homework1;

public class Main {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		Animal mySheep = new Sheep();
		
		Animal[] animals = {myDog, myCat, mySheep};
		
		// iterate the animal list
		for(Animal animal: animals) {
			animal.sound();
		}
	}
}
