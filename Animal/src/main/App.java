package main;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Mammal bubbles = new Human();
		Mammal fred = new Dolphin();
		fred.communicate();
		System.out.println(fred);
		List<Animal> animals = new ArrayList<>();
		animals.add(fred);
		animals.add(bubbles);
		for (Animal a : animals) {
			a.communicate();
		}
	}

}