package training;

public class 수조작하기1 {
	
	public static int solution(int n, String control) {
        int answer = 0;
        char[] ch = control.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == 'w') {
                n += 1;
            } else if(ch[i] == 's') {
                n -= 1;
            } else if(ch[i] == 'd') {
                n += 10;
            } else {
                n -= 10;
            }
        }
        answer = n;
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(0, "wsdawsdassw");
		
		System.out.print("test1 : ");
		System.out.println(test1);
	}
}
