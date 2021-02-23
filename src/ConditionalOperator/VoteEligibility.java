package ConditionalOperator;


public class VoteEligibility {

	public static void main(String ar[]) {


		int age = 55;
		boolean alive = true;

		if(!alive) {
			System.out.println("Person doesn't exist");
		}
		else if(age<0) {
			System.out.println("Invalid age");
		}
		else if(age>=18) {
			System.out.println("Can vote");
		}
		else {
			System.out.println("Person cannot vote");
		}
		
	}
}
