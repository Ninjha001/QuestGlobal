package basicjavaprg;

public class Sum {

	public static void main(String[] args) {
		System.out.println("Sum = "+ sum(new int[] {1,2,3,4}));
	}
	public static int sum(int[] x) {
		int s = 0;
		for(int i : x) {
			s = s+i;
		}
		return s;
	}

}
