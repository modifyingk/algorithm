package training;

public class 문자리스트를문자열로변환하기 {
	
	public static String solution(String[] arr) {
        String answer = "";
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] arr = {"a", "b", "c"};
		String test1 = solution(arr);
		
		System.out.print("test1 : ");
		System.out.println(test1);
	}
}
