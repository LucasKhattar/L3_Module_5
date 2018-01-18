package data_structures;

/** Copyright The League of Amazing Programmers 2013-2017
 *    Level 3
 *    A Murder of Crows
 *    Duration=.00
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=n/a
*/

import java.util.ArrayList;
import java.util.Random;

public class MurderOfCrows {

	ArrayList<Crow> theMurder = new ArrayList<Crow>();

	public static void main(String[] args) {
		MurderOfCrows murderOfCrows = new MurderOfCrows();
		murderOfCrows.initializeCrows();
		murderOfCrows.findTheDiamond();
	}

	private void findTheDiamond() {
		for (int i = 0; i < 5; i++) {
			if (theMurder.get(i).getStomachContents().contains("Diamond")) {
				if (i == 0) {
					System.out.println("Rok ate the diamond!");
					System.out.println("You kiled 1 crow!");
				}
				if (i == 1) {
					System.out.println("Merle ate the diamond!");
					System.out.println("You kiled 2 crows!");
				}
				if (i == 2) {
					System.out.println("Poe ate the diamond!");
					System.out.println("You kiled 3 crows!");
				}
				if (i == 3) {
					System.out.println("Grenwyn ate the diamond!");
					System.out.println("You kiled 4 crows!");
				}
				if (i == 4) {
					System.out.println("Crawford ate the diamond!");
					System.out.println("You kiled 5 crows!");
				}
			}
		}
		/*
		 * 1. One of the Crows has eaten the diamond. You need to search through the
		 * stomach of each Crow, then print the name of the guilty Crow.
		 */

		/* 2. How many innocent crows had to die before the diamond was found? */

	}

	private void initializeCrows() {
		theMurder.add(new Crow("Rok"));
		theMurder.add(new Crow("Merle"));
		theMurder.add(new Crow("Poe"));
		theMurder.add(new Crow("Grenwyn"));
		theMurder.add(new Crow("Crawford"));
		hideTheDiamond();
	}

	private void hideTheDiamond() {
		int randomness = new Random().nextInt(theMurder.size());
		theMurder.get(randomness).getStomachContents().add("Diamond");
	}
}

class Crow {
	private String name;
	private ArrayList<String> stomachContents = new ArrayList<String>();

	public Crow(String name) {
		this.name = name;
		fillCrowsStomach();
	}

	private void fillCrowsStomach() {
		for (int i = 0; i < 10; i++)
			this.stomachContents.add(getRandomCrowFood());
	}

	private String getRandomCrowFood() {
		int randomness = new Random().nextInt(4);
		if (randomness == 0)
			return "carrion";
		else if (randomness == 1)
			return "snail";
		else if (randomness == 2)
			return "acorn";
		else if (randomness == 3)
			return "spider";
		else
			return "grub";
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getStomachContents() {
		return stomachContents;
	}

}
