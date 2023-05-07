package basic;

public class 숫자찾기 {

	public static int solution(int num, int k) {
        int answer = -1;
        String[] str = String.valueOf(num).split("");
        for(int i = 0; i < str.length; i++) {
            if(Integer.parseInt(str[i]) == k) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(29183, 1);
		int test2 = solution(232443, 4);
		int test3 = solution(123456, 7);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
		
		System.out.print("test3 : ");
		System.out.println(test3);
	}

}
