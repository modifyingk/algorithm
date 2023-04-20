package training;

public class l로만들기 {
	
	public static String solution(String myString) {
        String answer = "";
        char[] ch = new char[myString.length()];
        for(int i = 0; i < myString.length(); i++) {
            ch[i] = myString.charAt(i);
            if(ch[i] < 109) {
            	ch[i] = 'l';
            }
        }
        answer = String.valueOf(ch);
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("abcdevwxyz");
		String test2 = solution("jjnnllkkmm");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
