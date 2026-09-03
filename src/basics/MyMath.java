package basics;

public class MyMath {
	public static void main(String[]args) {
		//Java Math
		System.out.println(Math.max(3, 6));
		System.out.println(Math.min(3, 6));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.abs(-3.6));
		System.out.println(Math.pow(6, 2));
		System.out.println(Math.random());
		
		//Rounding methods
		//Nearest integer
		System.out.println(Math.round(3.5));
		
		//rounds up (returns the smallest integer greater than or equal to x)
		System.out.println(Math.ceil(6.2));
		
		//rounds down (returns the largest integer less than or equal to x)
		System.out.println(Math.floor(6.2));

	}
}
