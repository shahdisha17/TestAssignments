package ArrayListAssignments;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		ArrayList<Double> salary = new ArrayList<Double>();
		salary.add(33.43);
		salary.add(34.43);
		salary.add(43.77);
		salary.add(45.4364);
		salary.add(73.43);
		salary.add(75.56);
		salary.add(72.41);
		salary.add(30.40);
		
		//System.out.println(salary);
		
		if(salary.contains(75.56)) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
	}

}
