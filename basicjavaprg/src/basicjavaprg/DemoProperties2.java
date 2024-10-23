package basicjavaprg;

import java.io.*;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DemoProperties2 {
	public static void main(String[] args) throws Exception{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\neerj\\eclipse-workspace\\basicjavaprg\\src\\basicjavaprg\\abc.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String password = p.getProperty("password");
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		Connection con = DriverManager.getConnection(url,user,password);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\neerj\\eclipse-workspace\\basicjavaprg\\src\\basicjavaprg\\abc.properties");
		p.store(fos, "updated by neerja to understand the properties demo for connection establishment");
	}
}
