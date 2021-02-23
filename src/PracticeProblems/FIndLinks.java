package PracticeProblems;

import java.util.ArrayList;

public class FIndLinks {

	// WAF where you need to pass the page name and return the total links
	// and another function -- return list of all the links text on the page
			
	public int pageLinks(String pageName) {
		
		int count=pageLinkText(pageName).size();
		return count;
		
	}
	
	public ArrayList<String> pageLinkText(String pageName) {
		ArrayList<String> pageLinks = new ArrayList<String>();
		if(pageName.equals("LoginPage")) {
			pageLinks.add("Login");
			pageLinks.add("Contact Us");
			pageLinks.add("Policy");
		}
		else if(pageName.equals("HomePage")) {
			pageLinks.add("LogOut");
			pageLinks.add("Wishlist");
			pageLinks.add("New Items");	
		}
		else {
			System.out.println("Page is not available");
		}
		return pageLinks;
	}
	
	
	
	public static void main(String[] args) {
		FIndLinks f1=new FIndLinks();
		int links= f1.pageLinks("LoginPage");
		System.out.println(links);
		ArrayList<String> allLinks = f1.pageLinkText("LoginPage");
		System.out.println(allLinks);

	}

}
