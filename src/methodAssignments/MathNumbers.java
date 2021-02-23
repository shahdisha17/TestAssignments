package methodAssignments;

public class MathNumbers {

	public int addNum(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public int productNum(int x, int y, int z) {
		int w= x*y*z;
		return w;
	}
	

	public static void main(String[] args) {
		MathNumbers a= new MathNumbers();
		int add = a.addNum(10, 25);
		System.out.println(add);
		
		int prod=a.productNum(2, 6, 4);
		System.out.println(prod);

	}

}
