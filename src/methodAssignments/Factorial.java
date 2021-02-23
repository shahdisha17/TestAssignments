package methodAssignments;

public class Factorial {
	
	public int factorialResult(int num) {
		int result=1;
		if(num==0) {
			result=0;
		}
		else if(num==1) {
			result=1;
		}
		else {
			for(int i=1;i<=num;i++) {
				result=result*i;
			}
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		Factorial f =new Factorial();
		int facresult= f.factorialResult(5);
		System.out.println(facresult);
		
	}

}
