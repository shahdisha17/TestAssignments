package LoopAssignments;

public class OddNumbers {

	public static void main(String[] args) {
		// while loop
		int i=1;
		while(i<=10) {
			if(i%2!=0) {
				System.out.println("Odd number is :" +i);
			}
			i++;
		}

		System.out.println("--------------");
		
		//for loop
		for(int n=1;n<=10;n++) {
			if(n%2!=0) {
				System.out.println("Odd no." + n);
			}
		}
		
		System.out.println("--------------");
		
		// do-while loop
		int m=1;
		do {
			if(m%2!=0) {
				System.out.println("Print Odd no :" +m);
			}
			m++;
		} while (m<=10);
	}

}
