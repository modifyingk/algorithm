package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
	
	public static void main(String[] args) {
		String[] name = new String[100];
		String[] tel = new String[100];
		int n = 0;
		
		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			
			while(inFile.hasNext()) {
				name[n] = inFile.next();
				tel[n] = inFile.next();
				n++;
			}
			
			for(int i = 0; i < n; i++) {
				System.out.println(name[i] + ": " + tel[i]);
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			System.exit(0);
		}
		
	}
}
