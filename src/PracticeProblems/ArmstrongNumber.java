package PracticeProblems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		int n,r,num;
		int cubeSum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		n = in.nextInt();
		num = n;
        while (num > 0)
        {
            r = num % 10;
            cubeSum = cubeSum + (r * r * r);
            num = num / 10;
        }
        if (n == cubeSum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
		
		
		
	}

}
