package ArrayAssignments;

public class CricketData {

	public static void main(String[] args) {
		Object ob[]=new Object[7];
		ob[0]="Virat Kohli";
		ob[1]=32;
		ob[2]="India";
		ob[3]="04-22-1989";
		ob[4]='M';
		ob[5]=76.78;
		ob[6]=true;
		
		for(int a=0;a<ob.length;a++) {
			System.out.println(ob[a]);
		}
		
		System.out.println("--------------");
		
		Object ob1[]=new Object[7];
		ob1[0]="Jofra Archer";
		ob1[1]=28;
		ob1[2]="England";
		ob1[3]="07-22-1992";
		ob1[4]='M';
		ob1[5]=23.33;
		ob1[6]=true;

		for(Object b:ob1) {
			System.out.println(b);
		}
		
		
	}

}
