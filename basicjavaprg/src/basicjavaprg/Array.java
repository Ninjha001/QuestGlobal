package basicjavaprg;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] a = new int[-3]; 
		System.out.println(a.length);*/
		//int[][] a = new int[2][3];
		/*int[][] a = new int[2][];
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[0][0]);*/
		
		//int[][] a = {{10,20,30},{40,50}};
		/*int[][][] a = {{{10,20,30},{40,50}},{{60},{70,80},{90,100,110}}};
		System.out.println(a[0][0][0]);
		System.out.println(a[0][0][1]);
		System.out.println(a[0][0][2]);
		System.out.println(a[0][1][0]);
		System.out.println(a[0][1][1]);
		
		
		System.out.println(a[1][0][0]);
		System.out.println(a[1][1][0]);
		System.out.println(a[1][1][1]);
		System.out.println(a[1][2][0]);
		System.out.println(a[1][2][1]);
		System.out.println(a[1][2][2]);*/
		
		//int[] a = {10,20,30,40};
		/*for(int i : a) {
			System.out.println(i);
		}*/
		/*for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		//int[] a = {10,20,30,40};
		//System.out.println(sum(a));
		
		System.out.println(sum(new int[] {10,20,30,40}));
	}
	public static int sum(int[] x) {
		int total = 0;
		for(int x1 : x) {
			total = total+x1;
		}
		return total;
	}

}
