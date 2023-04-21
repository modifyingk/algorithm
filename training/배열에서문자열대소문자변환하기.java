package training;

public class 배열에서문자열대소문자변환하기 {
	
	public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            if(i % 2 != 0) {
                answer[i] = strArr[i].toUpperCase();
            } else {
                answer[i] = strArr[i].toLowerCase();
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] strArr1 = {"AAA", "BBB", "CCC", "DDD"};
		String[] strArr2 = {"aBc", "AbC"};
		
		String[] test1 = solution(strArr1);
		String[] test2 = solution(strArr2);
		
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
