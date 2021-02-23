package ArrayListAssignments;

import java.util.ArrayList;

public class TrimArray {

	public static void main(String[] args) {
			ArrayList<String> states=new ArrayList<String>();
			states.add("Illinois");
			states.add("New York");
			states.add("Virginia");
			states.add("North Carolina");
			states.add("Georgia");
			
			System.out.println(states);
			states.trimToSize();
			
			System.out.println("After trimming of an array :" +states);

	}

}
