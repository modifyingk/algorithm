package training;

public class 꼬리문자열 {
	
	public static String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i < str_list.length; i++) {
            if(!str_list[i].contains(ex)) {
                answer += str_list[i];
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] str1 = {"abc", "def", "ghi"};
		String[] str2 = {"abc", "bbc", "cbc"};
		
		String test1 = solution(str1, "ef");
		String test2 = solution(str2, "c");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
