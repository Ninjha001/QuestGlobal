package basicjavaprg;

public class MergedArray {

	public static void main(String[] args) {
		System.out.println("Merged Array: ");
		int[] a1 = {-2,0,100,4875,35738};
		int[] a3 = {200,34,5,67,890};
		mergeArrays(a1,a3);
	}
	public static void mergeArrays(int[] a1, int[] a3) {
	    int l = a1.length + a3.length; 
	    int[] a = new int[l];

	    for (int i = 0; i < a1.length; i++) {
	        a[i] = a1[i];
	    }

	    for (int j = 0; j < a3.length; j++) {
	        a[a1.length + j] = a3[j];
	    }
	    
	    for (int i = 0; i < l; i++) {
	        System.out.println(a[i]);
	    }
	}
}
