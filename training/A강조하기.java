package training;

import java.util.Scanner;

public class A강조하기 {
	
	public static String solution(String myString) {
        String answer = "";
        answer = myString.toLowerCase().replace("a", "A");
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("abstract algebra");
		String test2 = solution("PrOgRaMmErS");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
