package filedemo;

import java.io.File;

public class DemoFile3 {
	public static void main(String[] args) {
		int count = 0;
		File f = new File("c:\\");
		String[] s = f.list();
		for(String s1 : s) {
			File f2 = new File(f,s1);
			if(f2.isDirectory()) {
				++count;
				System.out.println(s1);
			}
		}
		System.out.println("total count: " + count);
	}
}
