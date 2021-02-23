package LoopAssignments;

public class AllLoops {

	public static void main(String[] args) {
		//while loop
		int i=10;
		while(i>=1) {
			System.out.println("Hello " + i);
			i--;
		}
 
	System.out.println("-------------");

	//for loop
	for (int k=10;k>=1;k--) {
		System.out.println("Print k value :" + k);
	}
	
	System.out.println("-------------");
	//do-while loop
	int n=10;
	do {
		System.out.println("Number starts from " +n );
		n--;
	} while (n>=1);
	
}	
	
}
