package com.syntax.class13;

public class Dog {

	public String breed, size, color;
	public int age;

	public void bark() {
		System.out.println("boo boo");
	}
	public void sleep() {
		System.out.println("Dog Sleep Zzzzzzzzzzz.....");
	}
	public void eat() {
		System.out.println("eating omnommmmm.........");
	}
	public void look() {
		System.out.println("Hi I am a dog my color is "+color);
	}
	
	public static void main(String[] args) {

		Dog bullDog = new Dog();
		bullDog.breed = "American BullDog";
		bullDog.age = 5;
		bullDog.size = "XL";
		bullDog.color = "pink";
		
		Dog beagle=new Dog();
		beagle.age=8;
		beagle.breed="Japan";
		beagle.size="small";
		beagle.color="white";
	}
}
