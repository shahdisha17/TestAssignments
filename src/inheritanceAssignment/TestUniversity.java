package inheritanceAssignment;

public class TestUniversity {
	
	public static void main(String[] args) {

	GECGCollege gecg=new GECGCollege();
	gecg.universityMainAdmin();
	gecg.mechanicalEngineering();
	gecg.universityLocation();//Overridden
	gecg.universityDean();
	
	System.out.println("--------------");
	
	University un = new University();
	un.universityDean();
	un.mechanicalEngineering();
	
	System.out.println("--------------");
	
	BhanduCollege bhandu = new BhanduCollege();
	bhandu.universityLocation();
	bhandu.mechanicalEngineering();
	
	System.out.println("--------------");
	
	//Top(Up) casting
	CentralUniversity cu = new VishwakarmaCollege();
	cu.universityMainAdmin();
	cu.universityDean();
	
	
	//Down casting
	//VishwakarmaCollege vc= new University();
	
	
	
	}
}
