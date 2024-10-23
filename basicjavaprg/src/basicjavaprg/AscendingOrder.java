package basicjavaprg;

public class AscendingOrder {

	public static void main(String[] args) {
		System.out.println("Ascending Order of array: ");
		int[] a3 = {200,34,5,67,890};
		ascendingOrder(a3);
	}
	public static void ascendingOrder(int[] a3) {
		for(int i=0;i<a3.length;i++) {
			for(int j=i+1;j<a3.length;j++) {
				if(a3[i]>a3[j]) {
					int t = a3[i];
					a3[i] = a3[j];
					a3[j] = t;
				}
			}
		}
		for(int i=0;i<a3.length;i++) {
			System.out.println(a3[i]);
		}
	}
}
