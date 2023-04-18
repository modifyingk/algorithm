package basic;

public class 짝수는싫어요 {

	public static int[] solution(int n) {
        int size = 0;
        if(n % 2 != 0) {
            size = n / 2 + 1;
        } else {
            size = n / 2;
        }
        int[] answer = new int[size];
        int j = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] test1 = solution(10);
		int[] test2 = solution(15);
		
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
