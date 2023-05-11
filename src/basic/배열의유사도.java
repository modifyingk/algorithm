package basic;

public class 배열의유사도 {

	public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i < s1.length; i++) {
            for(int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		
		String[] s3 = {"n", "omg"};
		String[] s4 = {"m", "dot"};

		int test1 = solution(s1, s2);
		int test2 = solution(s3, s4);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
