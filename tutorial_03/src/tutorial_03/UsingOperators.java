package tutorial_03;

public class UsingOperators {

	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		int z = x + x * y - y;
		System.out.println("The value of z is " + z);
		
		int w = (x + x) * y - y;
		System.out.println("The value of w is " + w);
		
		z = w + 3;
		System.out.println("The value of z is now " + z);
		
		z -= 2;
		System.out.println("The value of z is " + z);
		
		z++;
		System.out.println("The value of z is " + z);
		
		--z;
		System.out.println("The value of z is " + z); 

	}

}
