package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {
	static String[] name = new String[100];
	static String[] tel = new String[100];
	static int n = 0;
	
	public static void main(String[] args) {
		
		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			
			while(inFile.hasNext()) {
				name[n] = inFile.next();
				tel[n] = inFile.next();
				n++;
			}
			
			inFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			System.exit(0);
		}
		
		bubbleSort();
		
		for(int i = 0; i < n; i++) {
			System.out.println(name[i] + ": " + tel[i]);
		}
	}
	
	static void bubbleSort() {
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(name[j].compareTo(name[j + 1]) > 0) {
					String tmp = name[j];
					name[j] = name[j + 1];
					name[j + 1] = tmp;
					
					tmp = tel[j];
					tel[j] = tel[j + 1];
					tel[j + 1] = tmp;
				}
			}
		}
	}
}
