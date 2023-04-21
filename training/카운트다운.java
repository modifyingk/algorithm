package training;

public class 카운트다운 {
	
	public static int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        int j = 0;
        for(int i = start; i >= end; i--) {
            answer[j] = i;
            j++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] test1 = solution(10, 3);
		
		System.out.print("test1 : [ ");
		for(int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println("]");
	}
}
