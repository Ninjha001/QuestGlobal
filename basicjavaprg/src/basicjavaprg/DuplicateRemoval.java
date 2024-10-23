package basicjavaprg;

public class DuplicateRemoval {

	public static void main(String[] args) {
		System.out.println("Array after removal of duplicate elements: ");
		int[] a2 = {1,2,2,3,3,3,4,4,5};
		duplicateRemove(a2);
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
