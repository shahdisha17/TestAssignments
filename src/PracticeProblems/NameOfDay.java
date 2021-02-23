package PracticeProblems;

public class NameOfDay {

	public static void main(String[] args) {
		String dayName="Monday";
		switch(dayName) {
		    case "Monday":
		    case "Tuesday":
		    case "Wednesday":
		    case "Thursday":
		    case "Friday":
		    case "Saturday":
		    case "Sunday":
		    	System.out.println("Today is " +dayName );
		    	break;
		    	default:
		    	System.out.println("Day is not valid");
		}

	}

}
