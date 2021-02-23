package ArrayListAssignments;

import java.util.ArrayList;

public class RemoveElement {

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
		salary.add(15.23);
		salary.add(16.24);
		salary.add(17.25);
		salary.add(17.49);
		
		System.out.println(salary);
		System.out.println("-------------");
		
		salary.remove(4);
		System.out.println(salary);

	}

}
