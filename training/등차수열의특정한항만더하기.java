package training;

public class 등차수열의특정한항만더하기 {
	
	public static String[] solution(String[] names) {
        int size = 0;
        if(names.length % 5 == 0) {
            size = names.length / 5;
        } else {
            size = names.length / 5 + 1;
        }
        String[] answer = new String[size];
        int j = 0;
        for(int i = 0; i < names.length; i += 5) {
            answer[j] = names[i];
            j++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		String[] test1 = solution(names);
		
		System.out.print("test1 : [ ");
		for(int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println("]");
	}
}
