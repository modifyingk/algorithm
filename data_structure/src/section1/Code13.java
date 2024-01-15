package section1;

import java.util.Scanner;

public class Code13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		
		for(int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		
		sc.close();
		
		int max = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				// 정수로 변환
				int val = 0;
				for(int k = i; k <= j; k++)
					val = val * 10 + data[k];
				
				// 소수인지 확인
				boolean isPrime = true;
				for(int k = 2; k * k <= val && isPrime; k++) 
					if(val % k == 0)
						isPrime = false;
				
				if(isPrime && val > 1 && val > max)
					max = val;
			}
		}
		if(max > 0)
			System.out.println(max);
		else
			System.out.println("No prime number");
	}
}
