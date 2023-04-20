package training;

public class 커피심부름 {
	
	public static int solution(String[] order) {
        int answer = 0;
        for(int i = 0; i < order.length; i++) {
            if(order[i].contains("americano") || order[i].equals("anything")) {
                answer += 4500;
            } else if(order[i].contains("cafelatte")) {
                answer += 5000;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
		String[] order2 = {"americanoice", "americano", "iceamericano"};
		
		int test1 = solution(order);
		int test2 = solution(order2);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
