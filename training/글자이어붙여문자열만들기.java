package training;

public class 글자이어붙여문자열만들기 {
	
	public static String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i = 0; i < index_list.length; i++) {
            answer += String.valueOf(my_string.charAt(index_list[i]));
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String my_string1 = "cvsgiorszzzmrpaqpe";
		int[] index_list1 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		
		String my_string2 = "zpiaz";
		int[] index_list2 = {1, 2, 0, 0, 3};
		
		String test1 = solution(my_string1, index_list1);
		String test2 = solution(my_string2, index_list2);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
