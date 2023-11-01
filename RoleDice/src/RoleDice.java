import java.util.Random;

public class RoleDice {

	public static void main(String[] args) {
		
		Random newNumber = new Random();
		int x = newNumber.nextInt(12) + 1;
		
		System.out.printf("You roled a: %d", x);

	}

}
