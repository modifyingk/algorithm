package training;

public class n개간격의원소들 {
	
	public static int[] solution(int[] num_list, int n) {
        int size = 0;
        if(num_list.length % n == 0) {
            size = num_list.length / n;
        } else {
            size = num_list.length / n + 1;
        }
        int[] answer = new int[size];
        int j = 0;
        for(int i = 0; i < num_list.length; i+=n) {
            answer[j] = num_list[i];
            j++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num = {4, 2, 6, 1, 7, 6};

		int[] test1 = solution(num, 2);
		int[] test2 = solution(num, 4);
		
		System.out.print("test1 : [ ");
		for(int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println("]");
		
		System.out.print("test2 : [ ");
		for(int i = 0; i < test2.length; i++) {
			System.out.print(test2[i] + " ");
		}
		System.out.println("]");
	}
}
