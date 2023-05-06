package basic;

public class 대문자와소문자 {

	public static String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i = 0; i < arr.length; i++) {
            if(Character.isUpperCase(arr[i].charAt(0))) {
                arr[i] = arr[i].toLowerCase();
            } else {
                arr[i] = arr[i].toUpperCase();
            }
            answer += arr[i];
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("cccCCC");
		String test2 = solution("abCdEfghIJ");
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
