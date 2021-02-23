package methodAssignments;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class MaxMinNum {

	public int maximumNumber(int x, int y, int z) {
		if(x>y && x>z) {
			System.out.println("X is the largest number");
			return x;
		}
		else if(y>z) {
			System.out.println("Y is the largest number");
			return y;
		}
		else {
			System.out.println("Z is the largest number");
			return z;
		}
	}
	
	public int minimumNumber(int x,int y,int z) {
		if(x<y && x<z) {
			System.out.println("X is the smallest number");
			return x;
		}
		else if(y<z) {
			System.out.println("Y is the smallest number");
			return y;
		}
		else {
			System.out.println("Z is the smallest number");
			return z;
		}
	}
	
	public static void main(String[] args) {
		MaxMinNum max= new MaxMinNum();
		int maxnum =max.maximumNumber(25, 37, 32);
		System.out.println(maxnum);
		
		int minnum =max.minimumNumber(25, 37, 32);
		System.out.println(minnum);

	}

}
