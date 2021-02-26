package PracticeProblems;

import java.util.Scanner;

public class WordSentence {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter");
		String st = sc.nextLine();
		//System.out.println(st);
		
		/*
		 * String[] s = st.split(" "); //System.out.println(s); for(int
		 * i=0;i<s.length;i++) { System.out.println(s[i]);
		 * 
		 * }
		 */
		
		for(int j=0;j<st.length();j++) {
			if(st.charAt(j)==' ') {
				System.out.println();
			}
			else {
				System.out.print(st.charAt(j));
			}
		}
		
		/*
		 * st=st+" ";
		 * 
		 * int l=st.length(); for (int i = 0; i < l; i++) { if(st.charAt(i)==' ') {
		 * System.out.println(ws); ws=""; } else { char ch; ch=st.charAt(i); ws=ws+ch; }
		 * }
		 */
}
}