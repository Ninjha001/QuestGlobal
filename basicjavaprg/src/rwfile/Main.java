package rwfile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import  java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		try {
			System.out.println("Enter the file name");
			String fileName = scanner.nextLine();
			File file = new File(fileName);
			if(!file.exists()) {
				throw new FileNotFoundException("File Not Found");
			}
			else {
				System.out.println("Do you want to read/write?. Enter 'r' for read or 'w' for write ");
				String mode = scanner.nextLine();
				if(mode.equalsIgnoreCase("r")) {
					try(BufferedReader br = new BufferedReader(new FileReader(file))){
						String line;
						while((line = br.readLine()) != null) {
							System.out.println(line);
						}
					}
					catch(IOException e) {
						System.out.println("Error encountered while trying to read file " + e.getMessage());
					}
				}
				else if(mode.equalsIgnoreCase("w")) {
					System.out.println("Enter the content to write to the file ");
					String content = scanner.nextLine();
					try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))) {     //if u give it false, the entire existing contents will be replaced by the newly entered content
						bw.newLine();
						bw.write(content);
						bw.newLine();
						System.out.println("Contents written successfully.");
					}
					catch(IOException e) {
						System.out.println("Error enncountered while trying to write to the file " + e.getMessage());
					}
				}
				else {
					System.out.println("Please enter a valid input. 'r'/'w' ");
				}
						
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			scanner.close();
		}
	}

}
