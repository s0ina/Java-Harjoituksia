package harjoitukset;

public class TypeCasting {
	public static void main(String[]args) {
		//For widening casting
		int myInt = 6;
		double myDouble = myInt;
		float myFloat = myInt;
		
		//For narrowing casting
		double narDouble = 6.45d;
		int narInt = (int) narDouble;
		
		
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(narInt);
		
	}
}
