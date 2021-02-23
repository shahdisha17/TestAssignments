package PracticeProblems;

public class LeapYear {

	public static void main(String[] args) {
		int year= 2020;
		while(year<=2050) {
			if(year%4==0) {
				System.out.println("Leap year :" +year);
			}
			year++;
		}

	}

}
