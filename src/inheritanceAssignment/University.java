package inheritanceAssignment;

public class University extends CentralUniversity{

	@Override
	public void universityMainAdmin() {
		System.out.println("Main admin is Ms.Disha Shah");
	}
	
	public void universityLocation() {
		System.out.println("Ahmedabad");
	}
	
	public void mathStream() {
		System.out.println("Math stream");		
	}
	
	public void mechanicalEngineering() {
		System.out.println("Mechanical Engineering");
	}
}
