package Day07.Review;

import java.util.Scanner;

public class Ex03_화폐매수2 {
	
	public static void main(String[] args) {
		/*
		 * 1. 필요한 변수 선언
		 * 		- (입력금액), (화폐매수), (화폐단위)
		 * 2. 구매비 입력
		 * 3. 화폐매수 계산
		 * 	3-1 화폐매수 계산
		 * 		(화폐매수) = (입력금액) / (화폐단위)
		 * 	3-2 잔액계산
		 * 		657825 - (50000 * 13)
		 * 		i) (잔액)  = (입력금액) - (화폐단위 * 화폐매수)
		 * 		ii) (잔액)  = (입력금액) % (화폐단위)
		 *  3-3 화폐단위 변환
		 *  	번갈아 가면서, /5, /2 연산을 반복
		 *  	(화폐단위) = (화폐단위) / 5
		 *  	(화폐단위) = (화폐단위) / 2
		 * 4. 3번 과정을 반복 
		 */
		Scanner sc = new Scanner (System.in);
		System.out.println("구매비 : ");
		int input = sc.nextInt();
		int money[] = {50000,10000,5000,1000,500,100,50,10,5,1};
		int i = 0;
		
		// while(money[i] >= 1) {
		while (i <=9) {
		// 화폐매수 계산 
		int count = input / money[i];
		System.out.println(money[i] + "\t\t " + count);
		
		// 잔액계산
		input = input % money[i];	// input = input - (50000 * count);
		
		// 화폐단위 순서를 증가
		i++;
		
		}
		sc.close();
	}
}
