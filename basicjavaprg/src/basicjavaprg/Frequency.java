package basicjavaprg;

public class Frequency {

	public static void main(String[] args) {
		int[] a2 = {1,2,3,2,3,4,5,5,4,4};
		System.out.println("Frequency of each element: ");
		frequency(a2);
	}
	public static void frequency(int[] a2) {
	    boolean[] counted = new boolean[a2.length];

	    for (int i = 0; i < a2.length; i++) {
	        if (!counted[i]) {
	            int count = 1;
	            for (int j = i + 1; j < a2.length; j++) {
	                if (a2[i] == a2[j]) {
	                    count++;
	                    counted[j] = true;
	                }
	            }
	            System.out.println(a2[i] + " = " + count);
	        }
	    }
	}

}
