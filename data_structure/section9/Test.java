package section9;

public class Test { // subclass of Object
	public int a = 10;
	public double x = 1.23;
	
	public String toString() {
		return a + " " + x;
	}
	
	public boolean equals(Object other) {
		Test other2 = (Test) other;
		 return a == other2.a && x == other2.x;
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		Test test2 = new Test();
		
//		test2.a = 5;
//		test2.x = 1.29384792;

		System.out.println(test.toString());
		
		if(test2.equals(test))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
