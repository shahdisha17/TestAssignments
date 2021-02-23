package ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class WExtractPortionArray {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(75);
		marks.add(82);
		marks.add(35);
		marks.add(100);
		marks.add(47);
		marks.add(57);
		marks.add(29);
		marks.add(89);
		marks.add(17);

			System.out.println("List of Marks :" +marks);
			
		List<Integer> subList= marks.subList(2, 6);
		System.out.println("Extracted list of marks :" + subList);
	}

}
