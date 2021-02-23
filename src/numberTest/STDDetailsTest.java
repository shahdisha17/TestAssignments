package numberTest;

public class STDDetailsTest {

	public static void main(String[] args) {
		
		STDDetails sd=new STDDetails();
		sd.setStdName("Disha");
		sd.setStdId(73673);
		sd.setStdRollNo(33);
		
		System.out.println(sd.getStdName() + " " +sd.getStdRollNo()+ " " +sd.getStdId());
	}

}
