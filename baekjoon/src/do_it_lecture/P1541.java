package do_it_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String[] minus = str.split("-");
		for(int i = 0; i < minus.length; i++) {
			int plus_result = 0;
			String[] plus = minus[i].split("\\+");
			for(int j = 0; j < plus.length; j++) {
				plus_result += Integer.parseInt(plus[j]);
			}
			minus[i] = String.valueOf(plus_result);
		}
		int result = Integer.parseInt(minus[0]);
		for(int i = 1; i < minus.length; i++) {
			result -= Integer.parseInt(minus[i]);
		}
		System.out.println(result);
	}
}
