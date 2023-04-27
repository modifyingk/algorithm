package training;

public class 배열의원소만큼추가하기 {
	
	public static int[] solution(int[] arr) {
        int size = 0;
        for(int i = 0; i < arr.length; i++) {
            size += arr[i];
        }
        int[] answer = new int[size];
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                answer[k] = arr[i];
                k++;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr1 = {5, 1, 4};
		int[] arr2 = {6, 6};
		int[] arr3 = {1};
		
		int[] test1 = solution(arr1);
		int[] test2 = solution(arr2);
		int[] test3 = solution(arr3);
		
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
