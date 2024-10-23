package filedemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFileDemo {

	public static void main(String[] args) throws IOException {
		File f1 = new File("c:\\saiCharan","f1.txt");
		f1.createNewFile();
		File f2 = new File("c:\\saiCharan","f2.txt");
		f2.createNewFile();
		PrintWriter out = new PrintWriter("f1");
		out.println("aaa");
		out.println("bbb");
		out.println("ccc");
		out.close();
		out = new PrintWriter(f2);
		out.println("666");
		out.println("777");
		out.println("888");
		out.close();
		File f3 = new File("c:\\saiCharan","f3.txt");
		f3.createNewFile();
		out = new PrintWriter(f3);
		BufferedReader br = new BufferedReader(new FileReader(f1));
		String line = br.readLine();
		while(line != null) {
			out.println(line);
			line = br.readLine();
		}
		br.close();
		br = new BufferedReader(new FileReader(f2));
		line = br.readLine();
		while(line != null) {
			out.println(line);
			line = br.readLine();
		}
		br.close();
		out.close();
	}

}
