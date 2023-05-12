package basic;

public class 이차원으로만들기 {

	public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int k = 0;
        for(int i = 0 ; i < num_list.length / n; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[k];
                k++;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] num2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
		
		int[][] test1 = solution(num1, 2);
		int[][] test2 = solution(num2, 3);
		
		System.out.print("test1 : [ ");
		for(int i = 0; i < test1.length; i++) {
			System.out.print("[ ");
			for(int j = 0; j < test1[i].length; j++) {
				System.out.print(test1[i][j] + " ");
			}
			System.out.print("] ");
		}
		System.out.println("]");
		
		System.out.print("test2 : [ ");
		for(int i = 0; i < test2.length; i++) {
			System.out.print("[ ");
			for(int j = 0; j < test2[i].length; j++) {
				System.out.print(test2[i][j] + " ");
			}
			System.out.print("] ");
		}
		System.out.println("]");
	}

}
