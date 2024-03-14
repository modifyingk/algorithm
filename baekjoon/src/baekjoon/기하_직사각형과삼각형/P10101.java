package baekjoon.기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10101 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		if(a + b + c == 180) {
			if(a == 60 && b == 60 && c == 60) { // 세 각의 크기가 모두 60인 경우
				System.out.println("Equilateral");
			} else if(a != b && b != c && a != c) { // 같은 각이 없는 경우
				System.out.println("Scalene");
			} else { // 두 각이 같은 경우
				System.out.println("Isosceles");
			}
		} else {
			System.out.println("Error");
		}
	}
}
