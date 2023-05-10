package basic;

public class 합성수찾기 {

	public static int solution(int n) {
        int answer = 0;
        int count[] = new int[n];
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= n; j++) {
                if((i + 1) % j == 0) {
                    count[i] += 1;
                }
            }
            if(count[i] >= 3) {
                answer++;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(10);
		int test2 = solution(15);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
