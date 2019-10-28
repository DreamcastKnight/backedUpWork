package main;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Assessmentboiapp {

	public static void main(String[] args) {
		int personu = 4;
		int personr = 4;
		Random randu = new Random();
		Random randr = new Random();
		int locationu = randu.nextInt(10);
		int locationr = randr.nextInt(10);

		int[] p = { personu, personr };

		int[] l = { locationu, locationr };
		DecimalFormat format = new DecimalFormat("#.##");
		double dist = Math.hypot((p[0] - l[0]), (p[1] - l[1]));
		System.out.println("You stand in the middle of a dark, stinking swamp.");
		System.out.println(
				"The air feels thick and damp,and there is a silent hill-esque fog surrounding you, limiting your vision.");
		System.out.println(
				"You notice something in your hand, is it a pocketwatch? You open it and see " + format.format(dist)
						+ "m on the dial of this odd pocket watch, it doesn't appear to be denoting time.");
		Scanner scan = new Scanner(System.in);

		while (!(p[0] == l[0]) | !(p[1] == l[1])) {
			System.out.println("Try 'north', 'south', 'west', or 'east'.");
			String input = scan.nextLine();
			if (input.contains("north")) {
				System.out.println("You moved: " + input);
				Move jack = new Move();
				System.out.println(jack.north(p));
			} else if (input.contains("east")) {
				System.out.println("You moved: " + input);
				Move jack = new Move();
				System.out.println(jack.east(p));
			} else if (input.contains("south")) {
				System.out.println("You moved: " + input);
				Move jack = new Move();
				System.out.println(jack.south(p));
			} else if (input.contains("west")) {
				System.out.println("You moved: " + input);
				Move jack = new Move();
				System.out.println(jack.west(p));
			} else {
				System.out.println(
						"Rather than moving or doing anything, just stand in the same spot. Hopefully you can find the motivation to actually do something soon, this isn't very interesting at all to watch.");
			}
			double dist1 = Math.hypot((p[0] - l[0]), (p[1] - l[1]));
			System.out.println("The strange watch reads: " + format.format(dist1));
		}
		System.out.println(
				"As you approuch your destination, you start to see an object in the mist! It appears to be a treasure chest of some kind, something about it seems almost sinister.");
		System.out.println("Do you wish to open the chest? y/n");
		String input = scan.nextLine();
		if (input.contains("n")) {
			System.out.println(
					"You decide instead to search for a way out, ignoring the watch, and eventually escape the disgusting swamp. You definitely need to take a shower after that situation.");
			System.out.println("The end.");
		}

		else if (input.contains("y")) {
			System.out.println(
					"You move towards the chest, feeling the excitement as you finally reach your goal. As you open it, you see a flash of light-");
			System.out.println("The chest was a mimic");
			System.out.println("YOU DIED");
			System.out.println("press 'f' to pay respects");
			String input1 = scan.nextLine();
			if (input1.contains("f")) {
				System.out.println(
						"As you fade into nothingness, you start to hear something. It's an odd sound, almost like the sound of wheels on stone?");
				System.out.println(
						"You feel yourself fade back into consciousness, as the sound of wheels gets louder and louder. You hear a voice suddenly 'Hey, you. You're finally awake.'");
				System.out.println("The end?");

			} else {
				System.out.println("The end.");
			}
		}

		scan.close();
	}
}