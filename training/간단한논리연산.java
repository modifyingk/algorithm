package training;

public class 간단한논리연산 {
	
	public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        answer = (x1 || x2) && (x3 || x4);
        return answer;
    }
	
	public static void main(String[] args) {
		boolean test1 = solution(false, true, true, true);
		boolean test2 = solution(true, false, false, false);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
