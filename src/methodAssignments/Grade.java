package methodAssignments;

import java.util.Scanner;

public class Grade {
	
	public String gradeVerify(int marks) {
		
		if(marks>90 && marks<=100) {
			return "AA";
		}
		else if(marks>80 && marks<=90) {
			return "AB";	
		}
		else if(marks>70 && marks<=80) {
			return "BB";	
		}
		else if(marks>60 && marks<=70) {
			return "BC";	
		}
		else if(marks>50 && marks<=60) {
			return "CD";	
		}
		else if(marks>40 && marks<=50) {
			return "DD";	
		}
		else {
			return "Fail";
		}
	}
	public static void main(String[] args) {
		
		Grade g=new Grade();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks :");
		int grademarks = sc.nextInt();
		String result = g.gradeVerify(grademarks);
		System.out.println(result);
	}

}
