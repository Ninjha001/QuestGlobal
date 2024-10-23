package basicjavaprg;

public class Arrays {

	public static void main(String[] args) {
		
		int[] a1 = {-2,0,100,4875,35738};
		
		
		System.out.println("Sum = "+ sum(new int[] {1,2,3,4}));
		System.out.println();
		System.out.println("Largest Element = "+ largestElement(new int[] {100,-2,35738,4875}));
		System.out.println();
		System.out.println("Second Largest Element = "+ secondLargestElement(a1));
		System.out.println();
		System.out.println("Frequency of each element: ");
		int[] a2 = {1,2,2,3,3,3,4,4,5};
		frequency(a2);
		System.out.println();
		System.out.println("Ascending Order of array: ");
		int[] a3 = {200,34,5,67,890};
		ascendingOrder(a3);
		System.out.println();
		System.out.println("Reversed Array: ");
		reverseArray(a1);
		System.out.println();
		System.out.println("Merged Array: ");
		mergeArrays(a1,a3);
		System.out.println();
		System.out.println("Array after removal of duplicate elements: ");
		duplicateRemove(a2);
	}
	public static int sum(int[] x) {
		int s = 0;
		for(int i : x) {
			s = s+i;
		}
		return s;
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
	
	public static void duplicateRemove(int[] a2) {
		int[] a = new int[a2.length];
		int uCount = 0;
		for(int i =0;i<a2.length;i++) {
			boolean flag = false;
			for(int j=0;j<uCount;j++) {
				if(a2[i]==a[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				a[uCount] = a2[i];
				uCount++;
			}
		}
		int[] uArray = new int[uCount];
		for(int i=0;i<uCount;i++) {
			uArray[i] = a[i];
		}
		for(int i=0;i<uCount;i++) {
			System.out.println(uArray[i]);
		}
	}
}
