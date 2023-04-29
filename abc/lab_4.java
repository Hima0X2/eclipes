package abc;

import java.io.File;
import java.io.IOException;

public class lab_4 {

	public static void main(String[] args) {

		File myObj = new File("C:\\Users\\SANJIDA\\Desktop\\java\\abc.txt");
		try {
			if (myObj.exists()) {
				System.out.println("File exists");
			} else {
				System.out.println("Creating file");
				myObj.createNewFile();
			}
			if (myObj.isDirectory())
				System.out.println("Directory");
			else
				System.out.println("Not a Directory");

			if (myObj.isFile())
				System.out.println("File");
			else
				System.out.println("Not a file");

			String n = myObj.getName();
			System.out.println("File name is " + n);

			String p = myObj.getAbsolutePath();
			System.out.println(p);
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
