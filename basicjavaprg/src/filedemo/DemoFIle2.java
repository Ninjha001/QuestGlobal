package filedemo;

import java.io.File;
import java.io.IOException;

public class DemoFIle2 {
	public static void main(String[] args) throws IOException {
		File f2 = new File("c:\\saiCharan");
		f2.mkdir();
		File f = new File("c:\\saiCharan","demo.txt");
		f.createNewFile();
	}
}
