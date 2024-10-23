package filedemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class ExtractionDemo {

	public static void main(String[] args) throws IOException {
		File newFile = new File("c:\\saiCharan","extractedFile.txt");
		newFile.createNewFile();
		PrintWriter out = new PrintWriter(newFile);
		BufferedReader br = new BufferedReader(new FileReader("c:\\saiCharan\\original.txt"));
		String line;
		Set lines = new HashSet();
		while((line = br.readLine())!=null){
			if(lines.add(line)) {
				out.println(line);
			}
		}
		out.flush();
		br.close();
		out.close();
	}

}
