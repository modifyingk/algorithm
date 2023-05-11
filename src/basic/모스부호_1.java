package basic;

public class 모스부호_1 {

	public static String solution(String letter) {
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
        					"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        String[] alph = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                         "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
        String[] let = letter.split(" ");
        for(int i = 0; i < let.length; i++) {
            for(int j = 0; j < morse.length; j++) {
                if(let[i].equals(morse[j])) {
                    answer += alph[j];
                }
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution(".... . .-.. .-.. ---");
		String test2 = solution(".--. -.-- - .... --- -.");
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
