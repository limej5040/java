package chap_02;

public class _Quiz_02 {
	public static void main(String[] args) {
		
		// 어린이 키에 따른 놀이 기구 탑승 여부를 확인하는 프로그램을 작성
		// 키가 120cm 이상인 경우에만 탑승 가능
		// 삼항 연산자 > 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과 값)
		
		// 출력
		// 키가 115 cm 이므로 탑승 불가능합니다.
		// 키가 121 cm 이므로 탑승 가능합니다.
		
		int height = 121;
		
		String result = (120 <= height) ? "탑승 가능합니다. " : "탑승 불가능합니다.";
		
		System.out.println("키가 " + height +"cm 이므로 " + result); 

		
	}

}
