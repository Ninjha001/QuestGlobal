package stringmanipulations;

public class ReverseStringCharArray {
	public static void main(String[] args) {
		String s = new String("Neerja");
		int l = s.length();
		char[] arr = s.toCharArray();
		for(int i=0,j=l-1;i<l/2;i++,j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(arr);
	}
}
