package interfaceAssignment;

public interface USMedical extends WHO{
	
	int med_fee=20;
	
	public void neuroFacility();
	
	public void OrthoFacility();
	
	public void gynecFacility();
	public void radioFacility();
	
	public static void medicalServices() {
		System.out.println("Medical services....");
	}
}
