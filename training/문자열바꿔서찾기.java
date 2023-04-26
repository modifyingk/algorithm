package training;

public class 문자열바꿔서찾기 {
	
	public static int solution(String myString, String pat) {
        int answer = 0;
        char[] ch = myString.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == 'A') ch[i] = 'B';
            else if(ch[i] == 'B') ch[i] = 'A';
        }
        if(String.valueOf(ch).contains(pat)) answer = 1;
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution("ABBAA", "AABB");
		int test2 = solution("ABAB", "ABAB");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
