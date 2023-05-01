package training;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = a.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char)((int)ch[i] + 32);
            } else {
                ch[i] = (char)((int)ch[i] - 32);
            }
            System.out.print(ch[i]);
        }
	}
}
