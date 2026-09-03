package basics;

public class Operators {
	//a little practice + w3schools operators code challenge
	public static void main(String[]args ) {
		int itemPrice = 50;
		float shippingCost = 4.5f;
		float sum = shippingCost + (float)itemPrice;
		int x = 3;
		int y = 6;
		int z = 9;
		System.out.println(sum);
		System.out.println(z % y);
		System.out.println(z > x);
		System.out.println(z > x && z > y);
		System.out.println(sum++);
		System.out.println(sum--);
		System.out.println(sum += y);
	}
}
