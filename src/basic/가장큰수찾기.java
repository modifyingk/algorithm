package basic;

public class 가장큰수찾기 {

	public static int[] solution(int[] array) {
        int[] answer = {0, 0};
        for(int i = 0; i < array.length; i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr1 = {1, 8, 3};
		int[] arr2 = {9, 10, 11, 8};
		
		int[] test1 = solution(arr1);
		int[] test2 = solution(arr2);
		
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
