package constructorAssignments;

import java.util.ArrayList;

public class University {
	
		String name;
		String country;
		String stablishedDate;
		ArrayList<String> course;
		
		public University() {
			
		}
		
		public University(String nm,String cn) {
			this.name=nm;
			this.country=cn;
		}
		
		public University(String nm, String con, ArrayList<String> cou) {
			this.name = nm;
			this.country = con;
			this.course = cou;
		}

		public University(String nm, String con, String std, ArrayList<String> cou) {
			this.name = nm;
			this.country = con;
			this.stablishedDate = std;
			this.course = cou;
		}
		
		public String getCountry() {
			return country;
		}

		public String getStablishedDate() {
			return stablishedDate;
		}

		public ArrayList<String> getCourse() {
			return course;
		}

		public String getName() {
			return name;
		}

	

}
