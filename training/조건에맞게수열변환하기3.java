package training;

public class 조건에맞게수열변환하기3 {
	
	public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(k % 2 != 0) {
                answer[i] = arr[i] * k;
            } else {
                answer[i] = arr[i] + k;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 100, 99, 98};
		int[] arr2 = {1, 2, 3, 100, 99, 98};
		
		int[] test1 = solution(arr1, 3);
		int[] test2 = solution(arr2, 2);
		
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
