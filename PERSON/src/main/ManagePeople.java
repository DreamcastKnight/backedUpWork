package main;

import java.util.Arrays;
import java.util.List;

public class ManagePeople {

	public static void main(String[] args) {

		Person human = new Person("Frenchy", 22, "cheese-taster");
		Person jedi = new Person("Yoda", 900, "Jedi Master");
		Person hobbit = new Person("Bilbo", 111, "Burglar");
		Person timeLord = new Person("The Doctor", 209, "Unemployed");

		List<Person> everyone = Arrays.asList(human, jedi, hobbit, timeLord);
		System.out.println(everyone);
		
	}

}
