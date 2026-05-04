package com.inheritance;

public class Car extends Vehicle {

	void speed() {
		System.out.println("car is moving at 80km per hour");
	}
	public static void main(String[] args) {
		Car obj = new Car();
		obj.run();
		obj.speed();

	}

}
