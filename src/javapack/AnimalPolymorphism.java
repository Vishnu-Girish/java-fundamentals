package javapack;

class Animal {
	public void makeSound() {
		System.out.println("Some animal sound");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Bark");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
}

public class AnimalPolymorphism {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		a1.makeSound();
		a2.makeSound();
	}

}
