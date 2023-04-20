package training;

public class 배열비교하기 {
	
	public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1Sum = 0;
        int arr2Sum = 0;
        if(arr1.length > arr2.length) {
            answer = 1;
        } else if(arr1.length < arr2.length) {
            answer = -1;
        } else {
            for(int i = 0; i < arr1.length; i++) {
                arr1Sum += arr1[i];
                arr2Sum += arr2[i];
            }
            if(arr1Sum > arr2Sum) {
                answer = 1;
            } else if(arr1Sum < arr2Sum) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr1 = {49, 13};
		int[] arr2 = {70, 11, 2};
		
		int[] arr3 = {100, 17, 84, 1};
		int[] arr4 = {55, 12, 65, 36};
		
		int[] arr5 = {1, 2, 3, 4, 5};
		int[] arr6 = {3, 3, 3, 3, 3};
		
		int test1 = solution(arr1, arr2);
		int test2 = solution(arr3, arr4);
		int test3 = solution(arr5, arr6);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
		
		System.out.print("test3 : ");
		System.out.println(test3);
	}
}
