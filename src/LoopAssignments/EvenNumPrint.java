package LoopAssignments;

public class EvenNumPrint {

	public static void main(String[] args) {
		// while loop
		int i=0;
		while (i<=10) {
			if(i%2==0) {
				System.out.println("Even Number :" +i);
			}
			i++;
		}
		
		System.out.println("--------------");
		
		for(int k=0;k<=10;k++) {
			if(k%2==0) {
				System.out.println("Print Even no. " +k );
			}
		}
		
		System.out.println("--------------");
		
		int j=0;
		do {
			if(j%2==0) {
				System.out.println("Print even numbers :" +j);
			}
			j++;
		}while (j<=10);
	}
}
