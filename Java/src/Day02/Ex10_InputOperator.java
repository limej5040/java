package Day02;

import java.util.Scanner;

public class Ex10_InputOperator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x : ");
		int x = sc.nextInt();
		
		System.out.println("y : ");
		int y = sc.nextInt();
		
		System.out.println("z : ");
		int z = sc.nextInt();
		
		
		// 합계 , 평균
		int sum = x + y + z;
		double avg = sum / 3;		// 자동 형 변환 
		// (double) = (int) / (int)
		// * int 는 정수 자료형으로, 연산을 하면 결과도 int 자료형됩니다.
		// * int 정수 자료형으로는 실수의 소수 부분을 표현 할 수 없다.
		
		
		
		System.out.println("합계 :  " + sum);
		System.out.println("평균 :  " + avg);
		
		// (큰 자료형) + (작은 자료형) = ( 큰 자료형)
		// - 서로 다른 자료형을 연산시, 결과는 큰 자료형으로 변환된다.
		
		double realAvg = sum / 3;
		double realAvg2 = sum / 3.0;
		
		System.out.println("실제 평균1 : " +realAvg);
		System.out.println("실제 평균2 : " +realAvg2);
		
		
		sc.close();
		
	}

}
