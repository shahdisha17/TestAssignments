package interfaceAssignment;

public class TestHospital {

	public static void main(String[] args) {
		
		Apollo ap= new Apollo();
		ap.pathologyFacility();
		ap.emergencyFacility();
		ap.entFacility();
		ap.OrthoFacility();
		System.out.println(USMedical.med_fee);
		
		//Top casting
		USMedical us= new Apollo(); 
		us.OrthoFacility();
		us.neuroFacility();
		us.covidTest();
		
		USMedical.medicalServices();

	}

}
