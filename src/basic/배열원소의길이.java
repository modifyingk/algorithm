package basic;

public class 배열원소의길이 {

	public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] num1 = {"We", "are", "the", "world!"};
		String[] num2 = {"I", "Love", "Programmers."};
		
		int[] test1 = solution(num1);
		int[] test2 = solution(num2);
		
		System.out.print("test1 : [ ");
		for(int i = 0; i < num1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println("]");
		
		System.out.print("test2 : [ ");
		for(int i = 0; i < num2.length; i++) {
			System.out.print(test2[i] + " ");
		}
		System.out.println("]");
	}

}
