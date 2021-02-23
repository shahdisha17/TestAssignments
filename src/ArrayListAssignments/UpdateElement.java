package ArrayListAssignments;

import java.util.ArrayList;

public class UpdateElement {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(75);
		marks.add(82);
		marks.add(35);
		marks.add(100);
		marks.add(27);
		
		System.out.println(marks);
		System.out.println("--------------");
		marks.set(2,45);
		System.out.println(marks);

	}

}
