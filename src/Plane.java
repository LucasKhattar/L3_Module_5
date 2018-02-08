import java.util.ArrayList;

class Plane  {
	int numberOfPassengers = 50;
	int death = 0;
	int percent;
	ArrayList<Snake> snakes = new ArrayList<Snake>();
	
	void snakeMaker() {
		for (int i = 0; i < 100; i++) {
			Snake s = new Snake(snakesOnAPlane.number(), snakesOnAPlane.trueOrFalse());
			snakes.add(s);
		}
		for (int i = 0; i < snakes.size(); i++) {
			if(snakes.get(i).venomous==true) {
				death = snakes.get(i).viciousness+death;
			}
		}
		death = death*10;
		percent = death/numberOfPassengers;
		System.out.println("You have a "+percent+"% chance of dying!");
	}
}