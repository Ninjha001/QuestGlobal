package basicjavaprg;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] a1 = {-2,0,100,4875,35738};
		System.out.println("Second Largest Element = "+ secondLargestElement(a1));
	}
	public static int secondLargestElement(int[] a1) {
		for(int i=0;i<a1.length;i++) {
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]>a1[j]) {
					int t = a1[i];
					a1[i] = a1[j];
					a1[j] = t;
				}
			}
		}
		return (a1[a1.length-2]);
	}

}
