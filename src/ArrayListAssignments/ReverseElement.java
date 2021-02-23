package ArrayListAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElement {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(75);
		marks.add(82);
		marks.add(35);
		marks.add(100);
		marks.add(27);
		
		Collections.reverse(marks);
			System.out.println(marks);
	}

}
