package basicjavaprg;

public class ReverseArray {

	public static void main(String[] args) {
		System.out.println("Reversed Array: ");
		int[] a1 = {-2,0,100,4875,35738};
		reverseArray(a1);
	}
	public static void reverseArray(int[] a1) {
        int left = 0; 
        int right = a1.length - 1; 

        while (left < right) {
            int temp = a1[left];
            a1[left] = a1[right];
            a1[right] = temp;

            left++;
            right--;
        }

       for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
    }
}
