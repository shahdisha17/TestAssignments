
public class SplitLanguage {

	public static void main(String[] args) {
		
		String st= "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String[] lang=st.split("_");
		for(String e : lang) {
				for(int i=e.length()-1; i>=0;i--) {
				System.out.print(e.charAt(i));			
			}
		System.out.print(" ");
			/*
			 * StringBuilder sb=new StringBuilder(e); 
			 * System.out.print(sb.reverse()+ " ");
			 */
		}
		System.out.println("");
		
		System.out.println("------------------------");
		
		String d= "100A";
		String i =d.substring(0, 3);
		int k=Integer.parseInt(i);
		System.out.println(k+20);
	}
}

