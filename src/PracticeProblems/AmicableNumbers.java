package PracticeProblems;

import java.util.Scanner;

public class AmicableNumbers {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter first number -->");
		int a = in.nextInt();
		System.out.println("Enter second number-->");
		int b = in.nextInt();
		
		int sum=0; int sum2=0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				sum += i;
				//System.out.println(add);
				
			}
		}
		for (int i=1;i<=b;i++) {
			if(b%i==0) {
				sum2 +=i;
			}
		}
		
		if(sum==sum2) {
			System.out.println("Two numbers are AmbicalNumbers");
		}
		else {
			System.out.println("Numbers are not AmbicalNumbers");
		}

	}

}



