package do_it_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int won = Integer.parseInt(st.nextToken());
		int[] coin = new int[num];
		
		for(int i = 0; i < num; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		for(int i = coin.length - 1; i > 0; i--) {
			if(coin[i] < won) {
				count += won / coin[i];
				won = won % coin[i];
			}
		}
		
		System.out.println(count);
	}
}
