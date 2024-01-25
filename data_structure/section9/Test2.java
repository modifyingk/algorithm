package section9;

public class Test2 {
	
	public static void main(String[] args) {
		Object[] array = new Object[100];
		int a = 20;
		
		Integer age = new Integer(a); // wrapping
		array[0] = age;
		int b = age.intValue();	// unwrapping
		System.out.println(b);
		
		array[1] = a;	// auto boxing
		int b2 = (Integer)array[0];	// auto unboxing
		System.out.println(b2);
		
		String str = "1234";
		int c = Integer.parseInt(str);
		System.out.println(str + 1);
		System.out.println(c + 1);
	}
}
