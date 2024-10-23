package filedemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFile {
	public static void main(String[] args) throws IOException{
//		int count=0; 
		File f=new File("c:\\charan_classes");
		f.mkdir();
		File f2 = new File("c:\\charan_classes","neeru.txt");
		f2.createNewFile();
//		String[] s = f.list();
		
//		for(String s1 : s) {
//			++count;
//			System.out.println(s1);    //it will count all the files as well as the directories.
//		}
		
//		for(String s1 : s) {
//			File f3 = new File(f,s1);
//			if(f3.isFile()) {
//				++count;
//				System.out.println(s1);
//			}
//		}
//		System.out.println("total count: " + count);    //it will count just the files.
		
		
//		FileWriter fw = new FileWriter(f2,true);
//		fw.write(99);
//		fw.write("haran classes");
//		fw.write("\n");
//		char[] c = {'a','b','c'};           //using file writer to write to the file.
//		fw.write("\n");
//		fw.write(c);
//		fw.flush();
//		fw.close();
		
		
//		FileReader fr = new FileReader(f2);
//		int i = fr.read();
//		while(i!=-1) {                                     //file reader to read and print it out to the console
//			System.out.println((char)i);
//			i = fr.read();
//		}
//		fr.close();
		
//		FileReader fr = new FileReader(f2);
//		char[] arr = new char[(int)f2.length()];
//		int i = fr.read(arr);                                 //using file reader to get the output that is stored in a character array.
//		for(char c : arr) {
//			System.out.println(c);
//		}
//		fr.close();
		
//		BufferedWriter bw = new BufferedWriter(new BufferedWriter(new FileWriter(f2)));
//		bw.write(100);
//		bw.newLine();
//		char[] arr = {'a','b','c'};                                        //here, writing the contents to the file using buffered writer.
//		bw.write(arr);
//		bw.newLine();
//		bw.write("Neerja Binu Vimalan");
//		bw.newLine();
//		bw.write("Quest Global Training");
//		bw.flush();
//		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader(f2));
		String line = br.readLine();
		while(line!=null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}
