package basic;

public class 가위바위보 {

	public static String solution(String rsp) {
        String answer = "";
        char[] ch = rsp.toCharArray();
        char[] winRsp = new char[ch.length];
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == '0') winRsp[i] = '5';
            else if(ch[i] == '2') winRsp[i] = '0';
            else winRsp[i] = '2';
        }
        answer = String.valueOf(winRsp);
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("2");
		String test2 = solution("205");
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
