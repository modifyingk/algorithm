package do_it_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_other {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer =  new StringTokenizer(bufferedReader.readLine());
		
		int suNo = Integer.parseInt(stringTokenizer.nextToken()); // 숫자 개수
		int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 질의 개수
		
		// 합 배열 생성
		long[] s = new long[suNo + 1];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for(int i = 1; i <= suNo; i++) {
			s[i] = s[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		// 구간합 출력
		for(int q = 0; q < quizNo; q++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(s[j] - s[i - 1]);
		}
	}
}
