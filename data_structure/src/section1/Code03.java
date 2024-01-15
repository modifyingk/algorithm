package section1;

import java.util.Scanner;

public class Code03 {
	
	public static void main(String[] args) {
		String str = "Hello";
		String input = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please type a string : ");
		input = sc.next();
		
		if(str.equals(input)) {
			System.out.println("Strings match! :-)");
		} else {
			System.out.println("Strings do not match! :-(");
		}
		
		sc.close();
	}
}
