package ArrayListAssignments;

import java.util.ArrayList;

public class InsertElement {

	public static void main(String[] args) {
		ArrayList<String> arcolor= new ArrayList<String>();
		arcolor.add("Torquois");
		arcolor.add("Black");
		arcolor.add("White");
		arcolor.add("Green");
		arcolor.add("Red");
		
			System.out.println(arcolor);
		//Insert value on [0] index and [6] index
		arcolor.add(0,"Blue");
			System.out.println(arcolor);
		arcolor.add(6,"Brown");
			System.out.println(arcolor);

	}

}
