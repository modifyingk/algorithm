package training;

public class 배열의길이에따라다른연산하기 {
	
	public static int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        if(arr.length % 2 != 0) {
            for(int i = 0; i < arr.length; i++) {
                if(i % 2 == 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        } else {
            for(int i = 0; i < arr.length; i++) {
                if(i % 2 != 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {49, 12, 100, 276, 33};
		int[] num2 = {444, 555, 666, 777};
		
		int[] test1 = solution(num1, 27);
		int[] test2 = solution(num2, 100);
		
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
