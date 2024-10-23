package filedemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeDemoAllFiles {
	public static void main(String[] args) throws IOException {
		File directory = new File("c:\\saiCharan");
		File file = new File(directory,"allMerge.txt");
		PrintWriter out = new PrintWriter(file);
		String[] directoryList = directory.list();
		if(directoryList!=null) {
			for(String fileName : directoryList) {
				File currentFile = new File(directory,fileName);
				if(currentFile.isFile()) {
					BufferedReader br = new BufferedReader(new FileReader(currentFile));
					String line;
					while((line = br.readLine()) != null) {
						out.println(line);
					}
					br.close();
				}
			}
		}
		out.flush();
		out.close();
	}
}
