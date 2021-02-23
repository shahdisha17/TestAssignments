package ArrayAssignments;

public class PrintPattern {

	public static void main(String[] args) {
		int a[]= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39};
		/*
		 * a[0]="00"; a[1]=01;a[2]=02;a[3]=03;a[4]=04;a[5]=05;a[6]=06;a[7]=07; a[8]=08;
		 * a[9]=09;
		 */
		for(int i:a) {
			if(i>0 && i%10==0) {
				System.out.println();
			}
			
			if(i<=9) {
			System.out.print("0" +i + " ");
		 }
			else {
				System.out.print(i + " ");
			}
			
			
		}
	}

}
