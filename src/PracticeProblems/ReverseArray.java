package PracticeProblems;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		//int reverse=0;
		int i[]=new int[5];
		Scanner sc= new Scanner(System.in);
	
		for(int a=0;a<i.length;a++) {
				System.out.println("Enter number i[" + a + "]");
				i[a]=sc.nextInt();
		}
		System.out.println("Reverse Array are:");
        for (int a = 4; a > 0; a--)
        {
            System.out.println("i [" + a + "]:" + i[a]);
        }

	}

}
