package baekjoon.기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5073 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0)
				break;
			
			int max = Math.max(Math.max(a, b), c);
			if(a + b + c - max <= max) {
				System.out.println("Invalid");
			} else {
				if(a == b && b == c) { // 세 변의 길이가 모두 같은 경우
					System.out.println("Equilateral");
				} else if(a != b && b != c && a != c) { // 세 변의 길이가 모두 다른 경우
					System.out.println("Scalene");
				} else { // 두 변의 길이만 같은 경우
					System.out.println("Isosceles");
				}
			}
		}
	}
}
