package PracticeProblems;

import java.util.Scanner;

public class ShortName {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String st=sc.nextLine();
		String [] str = st.split(" ");
		
		
			
				System.out.print(str[0].charAt(0) + ". ");
			
				System.out.print(str[1].charAt(0) + ". ");
			
				System.out.print(str[2]);
			
			
		

	}
	}
