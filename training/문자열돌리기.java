package training;

import java.util.Scanner;

public class 문자열돌리기 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = a.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
	}
}
