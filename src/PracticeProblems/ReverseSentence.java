package PracticeProblems;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		String st;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence :");
		st = sc.nextLine();
		String Reverse ="";
		
		int l= st.length();
		for(int i=l-1;i>=0;i--) {
			char ch;
			ch=st.charAt(i);
			Reverse=Reverse+ch;
			
		}
		System.out.println(Reverse);
	}

}
