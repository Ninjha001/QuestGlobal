package com.readwritefile.www;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperationsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("1. Read file");
            System.out.println("2. Write file");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");  
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch(choice) {
                case 1:
                    System.out.print("Enter the file name: "); // Added print formatting
                    String fileName = scanner.nextLine();
                    readFile(fileName);
                    break;
                case 2:
                    System.out.print("Enter the file name: "); // Added print formatting
                    fileName = scanner.nextLine();
                    System.out.print("Enter the text: "); // Added print formatting
                    String text = scanner.nextLine();
                    writeFile(fileName, text);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again."); // Added default case
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number."); // More descriptive message
            }
        }
    }
    
    public static void readFile(String fileName) {
        BufferedReader reader = null;
        try {
            File file = new File(fileName);
            reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("File contents:"); // Added header for clarity
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName); // More specific error message
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage()); // More specific error message
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Failed to close the reader: " + e.getMessage()); // More specific error message
            }
        }
    }
    
    public static void writeFile(String fileName, String text) {
        BufferedWriter writer = null;
        try {
            File file = new File(fileName);
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(text);
            System.out.println("Text written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage()); // More specific error message
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Failed to close the writer: " + e.getMessage()); // More specific error message
            }
        }
    }
}
