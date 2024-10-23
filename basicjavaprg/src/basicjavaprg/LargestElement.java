package basicjavaprg;

public class LargestElement {

	public static void main(String[] args) {
		System.out.println("Largest Element = "+ largestElement(new int[] {100,-2,35738,4875}));
	}
	public static int largestElement(int[] x) {
		int l = 0;
		for(int i : x) {
			if(i > l) {
				l = i;
			}
		}
		return l;
	}

}
