package training;

public class 배열만들기1 {
	
	public static int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int j = 0;
        for(int i = 1; i <= n / k; i++) {
            answer[j] = k * i;
            j++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] test1 = solution(10, 3);
		int[] test2 = solution(15, 5);
		
		System.out.print("test1 : [ ");
		for(int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println("]");
		
		System.out.print("test2 : [ ");
		for(int i = 0; i < test2.length; i++) {
			System.out.print(test2[i] + " ");
		}
		System.out.println("]");
	}
}
