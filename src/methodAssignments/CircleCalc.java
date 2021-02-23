package methodAssignments;

public class CircleCalc {

	static float pi=3.14f;
	
	//Method to create circumference
	public float circuferenceCalculation(float radius) {
		float Circum= 2*pi*radius;
		return Circum;
	}

	//Method to create area of circle of radius
	public float areaCircleRadius(float radius) {
		float areaCircle=pi*radius*radius;
		return areaCircle;
	}
	
	public static void main(String[] args) {
		CircleCalc c=new CircleCalc();
		float calc = c.circuferenceCalculation(5);
		System.out.println(calc);
		
		float areaCirRad = c.areaCircleRadius(4);
		System.out.println(areaCirRad);
	}

}
