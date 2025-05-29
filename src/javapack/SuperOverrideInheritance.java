package javapack;

class Vehicle {
	String brand;
	int year;
	
	Vehicle(String brand , int year) {
		this.brand = brand;
		this.year = year;
	}
	
	void displayInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Year: " + year);
	}
}

class Car extends Vehicle {
	int numDoors;
	
	Car(String brand , int year , int numDoors) {
		super(brand,year);
		this.numDoors = numDoors;
	}
	
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Doors: " + numDoors);
	}
}

public class SuperOverrideInheritance {
	public static void main(String[] args) {
		Car myCar = new Car("Ford",2012,4);
		myCar.displayInfo();
	}

}
