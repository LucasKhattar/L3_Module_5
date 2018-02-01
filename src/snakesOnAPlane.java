import java.util.ArrayList;
import java.util.Random;



public class snakesOnAPlane {


	public static void main(String[] args) {
		Plane p = new Plane();
		p.snakeMaker();
	}

	public static boolean trueOrFalse() {
		int tof = new Random().nextInt(2);
		if (tof == 1) {
			return true;
		} else {
			return false;
		} 
	}

	public static int number() {
		int number = new Random().nextInt(10);
		return number;
	}

}

class Snake extends snakesOnAPlane{
	int viciousness = number();
	boolean venomous = trueOrFalse();
	
	int getViciousness() {
		return viciousness;
	} 

	void setViciousness(int vic) {
		vic = viciousness;
	}

	boolean getVenomous() {
		return venomous;
	}

	void setVenomous(boolean ven) {
		ven = venomous;
	}
}

class Plane extends Snake{
	int numberOfPassengers;
	ArrayList<Snake> snakes = new ArrayList<Snake>();

	void snakeMaker() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getViciousness());
			System.out.println(getVenomous());
		}
	}
}