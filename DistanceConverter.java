import java.util.*;

public class DistanceConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1) Miles to Kilometers // 2) Kilometers to miles");
		int decision = sc.nextInt();
		if (decision != 1 && decision != 2) {
			System.out.print("Improper option selected... exiting");
			System.exit(0);
		}
		
		float convert = sc.nextFloat();
		float answer = 0;
		
		if (decision == 1) {
			answer = (float) (convert * 1.60934);
			System.out.print(convert + " miles is " + answer + " kilometers.");
		}
		else if (decision == 2) {
			answer = (float) (convert * 0.621371);
			System.out.print(convert + " kilometers is " + answer + " miles.");
		}

		sc.close();
	}

}
