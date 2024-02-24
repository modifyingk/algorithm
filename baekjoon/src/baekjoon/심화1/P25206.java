package baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
 		double[] credit = new double[20]; // 학점
		String[] grade = new String[20]; // 등급
		double[] multiple = new double[20];
		for(int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			credit[i] = Double.parseDouble(st.nextToken());
			grade[i] = st.nextToken();
		}
		double creditTotal = 0;
		double sum = 0;
		for(int i = 0; i < 20; i++) {
			switch (grade[i]) {
			case "A+":
				multiple[i] = credit[i] * 4.5;
				break;
			case "A0":
				multiple[i] = credit[i] * 4.0;
				break;
			case "B+":
				multiple[i] = credit[i] * 3.5;
				break;
			case "B0":
				multiple[i] = credit[i] * 3.0;
				break;
			case "C+":
				multiple[i] = credit[i] * 2.5;
				break;
			case "C0":
				multiple[i] = credit[i] * 2.0;
				break;
			case "D+":
				multiple[i] = credit[i] * 1.5;
				break;
			case "D0":
				multiple[i] = credit[i] * 1.0;
				break;
			default:
				multiple[i] =credit[i] * 0.0;
				break;
			}
			
			if(!grade[i].equals("P")) {
				creditTotal += credit[i];
				sum += multiple[i];
			}
		}
		System.out.println(sum / creditTotal);
	}
}
