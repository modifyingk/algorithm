package baekjoon.재귀함수;

import java.io.*;

public class P25501 {
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			String s = br.readLine();
			bw.append(isPalindrome(s) + " " + count + "\n");
		}
		bw.flush();
		bw.close();
	}

	public static int recursion(String s, int l, int r) {
		count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    
    public static int isPalindrome(String s) {
    	count = 0;
        return recursion(s, 0, s.length()-1);
    }
    
}
