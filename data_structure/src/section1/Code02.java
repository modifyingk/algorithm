package section1;

import java.util.Scanner;

public class Code02 {
	
	public static void main(String[] args) {
		int number = 123;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer : ");
		int input = sc.nextInt();
		
		if(input == number) {
			System.out.println("Numbers match! :-)");
		} else {
			System.out.println("Numbers do not match! :-(");
		}
		
		sc.close();
	}
}
