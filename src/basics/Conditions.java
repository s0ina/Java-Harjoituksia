package basics;
import java.util.Scanner;

public class Conditions {
	public static void main(String[] args ) {
		//Short Hand If...Else
		Scanner age = new Scanner(System.in);
		System.out.println("Enter age:");
		int voterAge = age.nextInt();
							//if
		String message = (voterAge < 18) ? "Not old enough to vote"
							//else if
						:(voterAge == 18) ? "You're 18! Old enough to vote"
							//else
						: "Old enough to vote";
		System.out.println(message);
	}

}
