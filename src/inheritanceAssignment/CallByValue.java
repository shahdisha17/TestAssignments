package inheritanceAssignment;

public class CallByValue {

	int i=10;
	
	public void add(int i) {
		i=i+30;
		//return i;
	}
	
	public int addRef (int k) {
		this.i=i+k;
		System.out.println(this.i);
		return k;
	}
	public static void main(String[] args) {
		
		CallByValue call = new CallByValue();
		System.out.println(call.i);
		//int c= call.add(20);
		 call.add(20);
		//System.out.println(c);
		System.out.println(call.i);
		
		call.addRef(call.i);
		
		System.out.println(call.i);

	}

}
