
public class SplitFunction {

	
	
	public static void main(String[] args) {
		
		String st=" This is Disha Shah ";
		
		System.out.println(st.length());
		
		System.out.println(st.indexOf('h', 2));
		System.out.println(st.indexOf("i", st.indexOf("i")+2));
		//System.out.println(charin);
		System.out.println(st.indexOf("Disha"));
		
		System.out.println(st.trim());
		System.out.println(st.contains("Disha"));
		//split . verification
		String s= "This.is.Disha.Shah";
		System.out.println(s.split("\\.")[1]);
		
		String h="This;is;Chicago;city";
		String [] city= h.split(";");
		System.out.println(city[3]);
	}

}
