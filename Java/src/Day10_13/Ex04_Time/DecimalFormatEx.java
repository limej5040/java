package Day10_13.Ex04_Time;

import java.text.DecimalFormat;

public class DecimalFormatEx {
	
	public static void main(String[] args) {
		
		// DecimalFormat : 숫자 형식 클래스
		// - 숫자 데이터를 원하는 형식으로 표현하게 해주는 클래스
		// ex ) 천단위 굽누 기호 : 1,000,000
		
		double num = 1234.5678;
		
		// 숫자 형식 패턴 기호
		// 0	: 10 진수를  표기, 빈자리를 0으로 채움
		// # 	: 10 진수를 표기, 빈자리를 채우지 않음
		// ,	: 단위 구분
		// .	: 소수점
		// %	: 100 을 곱하고 % 표기 (백분율)
		// \u0044 : \(원화표시)
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000.0000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#####.#####");
		System.out.println(df.format(num));
		
		
		double num2 = 10000000;
		
		// 천 단위 구분(,)
		df = new DecimalFormat("#,###");
		System.out.println( df.format(num2));
		
		// 소수점(.)
		double num3 = 123;
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num3));
		
		// 백분율 (%)
		double num4 = 0.2;
		df = new DecimalFormat("#.#%");
		System.out.println( df.format(num4));
		
		df = new DecimalFormat("\u0044 #,### ");
		System.out.println(df.format(num2));
		
	}

}
