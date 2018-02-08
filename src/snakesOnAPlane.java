
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
