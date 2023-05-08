package basic;

public class 약수구하기 {

	public static int[] solution(int n) {
        int size = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                size++;
            }
        }
        int[] answer = new int[size];
        int j = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] test1 = solution(24);
		int[] test2 = solution(29);
		
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
