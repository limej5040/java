package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {
	
	public static void main(String[] args) {
		
		// 성적을 입력받아서 성적에 따른 학점 A~F 를 출력하시오
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적 : " );
		int score = sc.nextInt();
		
		char grade = 'F';
		
		
		// 90 점이상, A
		// 80 점이상, B
		// 70 점이상, C
		// 60 점이상, D
		// 50 점이상, E
		// 50 점미만, F
		
		// if
		if ( score >= 90 && score <= 100)
			grade = 'A';
		if ( score >= 80 && score < 90)
			grade = 'B';
		if ( score >= 70 && score < 80)
			grade = 'C';
		if ( score >= 60 && score < 70)
			grade = 'D';
		if ( score >= 60 && score < 50)
			grade = 'E';
		if ( score >= 50 && score < 0)
			grade = 'F';
		System.out.println("학점 : " + grade);
		
		System.out.println("----------------------------");
		
		// if ~ else / if ~ else
		if( score >= 90) {
			grade='A';
		}
		else if (score >= 80) {
			grade='B';
		}
		else if (score >= 70) {
			grade='C';
		}
		else if (score >= 60) {
			grade='D';
		}
		else if (score >= 50) {
			grade='E';
		}
		else {
			grade='F';
		}
		System.out.println("학점 :" + grade);
		
		
		
	}

}
