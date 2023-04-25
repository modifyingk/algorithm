package training;

import java.util.Scanner;

public class 접두사인지확인하기 {
	
	public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.startsWith(is_prefix)) answer = 1;
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution("banana", "ban");
		int test2 = solution("banana", "nan");
		int test3 = solution("banana", "abcd");
		int test4 = solution("banana", "bananan");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);

		System.out.print("test3 : ");
		System.out.println(test3);
		
		System.out.print("test4 : ");
		System.out.println(test4);
	}
}
