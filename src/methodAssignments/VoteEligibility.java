package methodAssignments;

public class VoteEligibility {

	public boolean isVoteEligible(int age) {
		if(age>=18) {
			System.out.println("Person is eligible to vote");
			return true;
		}
		else {
			System.out.println("Person is not eligible to vote");
			return false;
		}
	}
	
	public static void main(String[] args) {
		VoteEligibility vote= new VoteEligibility();
		vote.isVoteEligible(19);

	}

}
