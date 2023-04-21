package training;

public class 카운트업 {
	
	public static int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        int j = 0;
        for(int i = start; i <= end; i++) {
            answer[j] = i;
            j++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] test1 = solution(3, 10);
		
		System.out.print("test1 : [ ");
		for(int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println("]");
	}
}
