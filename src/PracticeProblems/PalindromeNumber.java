package PracticeProblems;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n,r;
		int pal=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		n=num;
		while(num>0) {
			r= num%10;
			pal=(pal*10)+r;
			num=num/10;
		}
		if(n==pal) {
			System.out.println("No is palindrome");
		}else {
			System.out.println("No is not palindrome");
		}
	}

}
