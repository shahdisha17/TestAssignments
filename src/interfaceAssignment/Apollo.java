package interfaceAssignment;

public class Apollo implements USMedical,UKMedical,INMedical{

	public void entFacility() {
		System.out.println("ENT---- service");
	}
	
	public void pathologyFacility() {
		System.out.println("Pathology---- service");
	}

	@Override
	public void neuroFacility() {
		System.out.println("NeuroUS---- service");	
	}

	@Override
	public void OrthoFacility() {
		System.out.println("OrthoUS---- service");	
	}

	@Override
	public void gynecFacility() {
		System.out.println("GynecUS---- service");	
	}

	@Override
	public void radioFacility() {
		System.out.println("RadioUS---- service");		
	}

	@Override
	public void cardioFacility() {
		System.out.println("CardioUK---- service");		
	}

	@Override
	public void emergencyFacility() {
		System.out.println("EmergencyIndia---- service");		
	}

	@Override
	public void covidTest() {
		System.out.println("CovidWHO---- service");	
		
	}
	
	
}

	