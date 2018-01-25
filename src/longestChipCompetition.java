import java.util.ArrayList;
import java.util.Random;

public class longestChipCompetition {
	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest
	 * chip. (In England, french fries are called "chips".) * Find the Beatle with
	 * the longest chip. You may not edit the Chip or Beatle classes. Make sure to
	 * initialize The Beatles before you start your search. *
	 **/
	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");
		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}

	public static void main(String[] args) {
		longestChipCompetition chip = new longestChipCompetition();
		chip.initializeBeatles();
		ArrayList<Chip> george = new ArrayList<Chip>();
		george.addAll(chip.theBeatles.get(0).getChips());
		double G = george.get(0).getLength();
		for (int i = 0; i < george.size(); i++) {
			if (G <= george.get(i++).getLength()) {
				G = george.get(i++).getLength();
			}
		}
		ArrayList<Chip> john = new ArrayList<Chip>();
		john.addAll(chip.theBeatles.get(1).getChips());
		double J = john.get(0).getLength();
		for (int j = 0; j < john.size(); j++) {
			if (J <= john.get(j++).getLength()) {
				J = john.get(j++).getLength();
			}
		}
		ArrayList<Chip> paul = new ArrayList<Chip>();
		paul.addAll(chip.theBeatles.get(2).getChips());
		double P = paul.get(0).getLength();
		for (int k = 0; k < paul.size(); k++) {
			if (P <= paul.get(k++).getLength()) {
				P = paul.get(k++).getLength();
			}
		}
		ArrayList<Chip> ringo = new ArrayList<Chip>();
		ringo.addAll(chip.theBeatles.get(3).getChips());
		double R = ringo.get(0).getLength();
		for (int l = 0; l < ringo.size(); l++) {
			if (R <= ringo.get(l++).getLength()) {
				R = ringo.get(l++).getLength();
			}
		}
		if (G >= J && P >= R) {
			if (G >= P) {
				System.out.println("George Has The Longest Chip!");
			} else {
				System.out.println("Paul Has The Longest Chip!");
			}
		}

		else if (G <= J && P >= R) {
			if (J >= P) {
				System.out.println("John Has The Longest Chip!");
			} else {
				System.out.println("Paul Has The Longest Chip!");
			}
		}

		else if (G >= J && P <= R) {
			if (G >= R) {
				System.out.println("George Has The Longest Chip!");
			} else {
				System.out.println("Ringo Has The Longest Chip!");
			}
		}

		else if (G <= J && P <= R) {
			if (J >= R) {
				System.out.println("John Has The Longest Chip!");
			} else {
				System.out.println("Ringo Has The Longest Chip!");
			}
		}
	}

	class Beatle {
		private String name;
		private ArrayList<Chip> chips = new ArrayList<Chip>();

		public Beatle(String name) {
			this.name = name;
			initializePlateOfChips();
		}

		private void initializePlateOfChips() {
			int numberOfChips = new Random().nextInt(100);
			for (int i = 0; i < numberOfChips; i++) {
				chips.add(new Chip(new Random().nextDouble() * 10));
				if (this.name.contains("in"))
					chips.add(new Chip(10));
			}
		}

		public ArrayList<Chip> getChips() {
			return this.chips;
		}

		public String getName() {
			return this.name;
		}
	}

	class Chip {
		private double length;

		public double getLength() {
			return length;
		}

		Chip(double d) {
			this.length = d;
		}
	}
}
