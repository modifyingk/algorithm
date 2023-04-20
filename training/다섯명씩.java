package training;

public class 다섯명씩 {
	
	public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0; i < included.length; i ++) {
            if(included[i]) {
                answer += a + i * d;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		boolean[] included1 = {true, false, false, true, true};
		boolean[] included2 = {false, false, false, true, false, false, false};
		
		int test1 = solution(3, 4, included1);
		int test2 = solution(7, 1, included2);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
