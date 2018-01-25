import java.util.Random;

public class snakesOnAPlane {
public static void main(String[] args) {
	snakesOnAPlane.trueOrFalse();
}
static boolean trueOrFalse() {
	int tof = new Random().nextInt(2);
	if(tof==1) {
		System.out.println("True");
		return true;
	}
	else {
		System.out.println("False");
		return false;		
	}
}
}
