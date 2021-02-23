package ArrayListAssignments;

import java.util.ArrayList;

public class PrintPositionElement {

	public static void main(String[] args) {
	
			ArrayList<String> states=new ArrayList<String>();
			states.add("Illinois");
			states.add("New York");
			states.add("Virginia");
			states.add("North Carolina");
			states.add("Georgia");

			for(int i=0;i<states.size();i++) {
				System.out.println(states.get(i).toString());
			}
	}

}
