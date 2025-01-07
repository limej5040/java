package Day06.Ex01_PassingArgument;

public class CallByValue {
	// 메소드 정의
	// - 접근지정자 (static) 반환타입 메소드명 (매개변수){}
	// int 타입의 매개변수 2개를 전달받아 합계를 구하여 반환하는 메소드를 정의하시오 
	
	public static int sum (int a, int b) {
		a = 100;
		b = 200;
		int sum = a + b;
		System.out.println(":::::::: sum () 메소드호출 :::::::::");
		System.out.println("(a, b) : " + a + ", " + b);
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(":::::::: sum () 메소드호출 :::::::::");
		System.out.println("(a, b) : " + a + ", " + b);
		
		
		int sum = sum (a, b);
		System.out.println(" sum : " + sum);
		
		System.out.println(":::::::: sum () 메소드호출 :::::::::");
		System.out.println("(a, b) : " + a + ", " + b);
		
		
	}

}
