package filedemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class DeleteDuplicateDemo {

	public static void main(String[] args) throws IOException {
		File f1 = new File("c:\\saiCharan","original.txt");
		f1.createNewFile();
		PrintWriter out = new PrintWriter(f1);
		out.println("111");
		out.println("222");
		out.println("333");
		out.println("333");
		out.println("444");
		out.println("111");
		out.println("555");
		out.println("666");
		out.close();
		
		File f2 = new File("c:\\saiCharan","duplicate.txt");
		f2.createNewFile();
		out = new PrintWriter(f2);
		BufferedReader br = new BufferedReader(new FileReader(f1));
		String line ;
		Set lines = new HashSet();
		while((line = br.readLine()) != null) {
			if(lines.add(line)) {
				out.println(line);
			}
		}
		out.flush();
		br.close();
		out.close();
	}

}
