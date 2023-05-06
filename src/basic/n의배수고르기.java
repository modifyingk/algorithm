package basic;

public class n의배수고르기 {

	public static int[] solution(int n, int[] numlist) {
        int size = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                size++;
            }
        }
        int[] answer = new int[size];
        int j = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[j] = numlist[i];
                j++;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] num2 = {1, 9, 3, 10, 13, 5};
		int[] num3 = {2, 100, 120, 600, 12, 12};
		
		int[] test1 = solution(3, num1);
		int[] test2 = solution(5, num2);
		int[] test3 = solution(12, num3);
		
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
		
		System.out.print("test3 : [ ");
		for(int i = 0; i < test3.length; i++) {
			System.out.print(test3[i] + " ");
		}
		System.out.println("]");
	}

}
