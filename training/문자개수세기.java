package training;

public class 문자개수세기 {
	
	public static int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] ch = my_string.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if((int)ch[i] >= 65 && (int)ch[i] <= 90) {
                answer[ch[i] - 65] += 1;
            } else {
                answer[ch[i] - 71] += 1;
            }
            
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] test1 = solution("Programmers");
		
		System.out.print("test1 : [ ");
		for(int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println("]");
	}
}
