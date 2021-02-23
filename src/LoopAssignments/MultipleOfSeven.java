package LoopAssignments;

public class MultipleOfSeven {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println("Print " + i);
			if(i%7==0) {
				break;
			}
			i++;	
		}
		
	}

}
