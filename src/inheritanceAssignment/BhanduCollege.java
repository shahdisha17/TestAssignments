package inheritanceAssignment;

public class BhanduCollege extends University {
	
	@Override
	public void universityMainAdmin() {
		System.out.println("Main admin is Mr.Sodasana");
	}
	
	@Override
	public void universityLocation() {
		System.out.println("Mehsana");
	}
	
	public void computerEngineering() {
		System.out.println("Computer");
	}
	
	public void englishStream() {
		System.out.println("English");
	}
}
