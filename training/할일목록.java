package training;

public class 할일목록 {
	
	public static String[] solution(String[] todo_list, boolean[] finished) {
        int size = 0;
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) size ++;
        }
        String[] answer = new String[size];
        int j = 0;
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                answer[j] = todo_list[i];
                j++;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] str1 = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] bl1 = {true, false, true, false};
		
		String[] test1 = solution(str1, bl1);
		
		System.out.print("test1 : [ ");
		for(int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println("]");
	}
}
