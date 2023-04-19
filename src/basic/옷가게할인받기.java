package basic;

public class 옷가게할인받기 {
	
	public static int solution(int price) {
        int answer = 0;
        if(price >= 500000) {
            answer = (int)(price * 0.8);
        } else if(price >= 300000) {
            answer = (int)(price * 0.9);
        } else if(price >= 100000) {
            answer = (int)(price * 0.95);
        } else {
            answer = price;
        }
        return answer;
    }

	public static void main(String[] args) {
		int test1 = solution(150000);
		int test2 = solution(580000);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
