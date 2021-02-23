package PracticeProblems;

import java.util.Scanner;

public class WordSentence {

	public static void main(String[] args) {
		String st;
		Scanner sc= new Scanner(System.in);
		st = sc.nextLine();
		String ws="";
		
         st=st+" ";
        
       int l=st.length();
        for (int i = 0; i < l; i++)
        {
            if(st.charAt(i)==' ')
            {
                System.out.println(ws);
                ws="";
            }
            else
            {
                char ch;
                ch=st.charAt(i);
                ws=ws+ch;
            }
	}

}
}