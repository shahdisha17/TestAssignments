package ConditionalOperator;

public class GreatestNumbersInFour {

	public static void main(String[] args) {
		int w=25;
		int x=78;
		int y=87;
		int z=91;
		
		if(w>x && w>y && w>z) {
			System.out.println("Largest number is " +w);
		}
		else if(x>y && x>z) {
			System.out.println("Largest number is " +x);
		}
		else if(y>z) {
			System.out.println("Largest number is " +y);
		}
		else {
			System.out.println("Largest number is " +z);
			
		}
		
	}

}
