package basic;

public class 머쓱이보다키큰사람 {

	public static int solution(int[] array, int height) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > height) {
                answer += 1;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {149, 180, 192, 170};
		int[] num2 = {180, 120, 140};

		int test1 = solution(num1, 167);
		int test2 = solution(num2, 190);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
