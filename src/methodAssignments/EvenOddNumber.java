package methodAssignments;

public class EvenOddNumber {
	
	
	public void evenOddNum(int num) {
		if(num%2==0) {
			System.out.println("Number is even--> " +num);
		}
		else {
			System.out.println("Number is odd--> " +num);
		}
	}
	

	public static void main(String[] args) {
		EvenOddNumber eo= new EvenOddNumber();
		eo.evenOddNum(25);

	}

}
