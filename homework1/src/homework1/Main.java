package homework1;

public class Main {
	public static void main(String[] args) {
		
		Animal[] animals = {new Dog(), new Cat(), new Sheep()};

		for (Animal animal : animals) {
			animalSound(animal);
		}

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
