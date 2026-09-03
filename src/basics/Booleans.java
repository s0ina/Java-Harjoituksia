package basics;
import java.util.Scanner;

public class Booleans {
	public static void main(String[] args) {
	//Combining some scanner + if/else practice here as well
	Scanner userNum = new Scanner(System.in);
	System.out.println("Enter age:");
	int age = userNum.nextInt();
	int votingAge = 18;
	
	if (age >= votingAge) {
		System.out.println(age >= votingAge);
		System.out.println("Old enough to vote!");
	}
	else {
		System.out.println(age >= votingAge);
		System.out.println("Not old enough to vote.");
	}

	}
}
