package inheritanceAssignment;

public class GECGCollege extends University {

	@Override
	public void universityMainAdmin() {
		System.out.println("Main admin is Mr.Amit Pandya");
	}
	
	@Override
	public void universityLocation() {
		System.out.println("Gandhinagar");
	}
	
	public void computerEngineering() {
		System.out.println("Computer");
	}
	
	public void electricalEngineering() {
		System.out.println("Electrical");
	}
	
}
