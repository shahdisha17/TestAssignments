package ArrayListAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElement {

	public static void main(String[] args) {
		ArrayList<String> states=new ArrayList<String>();
		states.add("Illinois");
		states.add("New York");
		states.add("Virginia");
		states.add("North Carolina");
		states.add("Georgia");
		
			System.out.println(states);
		Collections.swap(states, 1, 3);
			System.out.println(states);

	}

}
