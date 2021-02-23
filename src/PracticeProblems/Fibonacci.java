package PracticeProblems;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n;
		int a=0;
		int b=1;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n= sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		

	}

}
