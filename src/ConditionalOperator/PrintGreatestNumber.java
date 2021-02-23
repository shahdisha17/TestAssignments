package ConditionalOperator;

public class PrintGreatestNumber {

	public static void main(String[] args) {
		int i=25;
		int j=78;
		int k=87;
		
		if(i>j && i>k) {
			System.out.println("The greatest number is " + i);
		}
		else if(j>k) {
			System.out.println("The greatest number is  "+ j);
		}
		else {
			System.out.println("The greatest number is " + k );
		}

	}

}
