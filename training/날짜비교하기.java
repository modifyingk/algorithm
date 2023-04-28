package training;

public class 날짜비교하기 {
	
	public static int solution(int[] date1, int[] date2) {
        int answer = 0;
        if(date1[0] < date2[0]) {
            answer = 1;
        } else if(date1[0] > date2[0]) {
            answer = 0;
        } else {
            if(date1[1] < date2[1]) {
                answer = 1;
            } else if(date1[1] > date2[1]){
                answer = 0;
            } else {
                if(date1[2] < date2[2]) {
                    answer = 1;
                } else {
                    answer = 0;
                }
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] date1 = {2021, 12, 28};
		int[] date2 = {2021, 12, 29};
		
		int[] date3 = {1024, 10, 24};
		int[] date4 = {1024, 10, 24};
		
		int test1 = solution(date1, date2);
		int test2 = solution(date3, date4);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
