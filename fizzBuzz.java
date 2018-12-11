package messingAround.java;
import java.util.Scanner;
public class fizzBuzz {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	int passedInt = input.nextInt();
	System.out.print("Please enter an integer:");
	
	int fizzBuzz = 0, fizz = 0, buzz = 0;
	
		for (int i = 1; i <= passedInt; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
				fizzBuzz++;
			}
			else if (i % 3 == 0) {
				System.out.println("Fizz");
				fizz++;
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
				buzz++;
			}
			else {
				System.out.println(i);
			}
		}
		System.out.println("There were " + fizzBuzz + " FizzBuzz" + " in " + passedInt);
		System.out.println("There were " + fizz + " Fizz" + " in " + passedInt);
		System.out.println("There were " + buzz + " Buzz" + " in " + passedInt);
	}
	//input.close();
}