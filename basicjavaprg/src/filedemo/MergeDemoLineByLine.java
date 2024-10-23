package filedemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;

public class MergeDemoLineByLine {

	public static void main(String[] args) throws IOException {
		File f = new File("c:\\saiCharan","f4.txt");
		f.createNewFile();
		PrintWriter out = new PrintWriter(f);
		BufferedReader br1 = new BufferedReader(new FileReader("c:\\saiCharan\\f1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("c:\\saiCharan\\f2.txt"));
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		while(line1 != null || line2 != null) {
			if(line1 != null) {
				out.println(line1);
				line1 = br1.readLine();
			}
			if(line2 != null) {
				out.println(line2);
				line2 = br2.readLine();
			}
		}
		out.flush();
		br1.close();
		br2.close();
		out.close();
	}

}
