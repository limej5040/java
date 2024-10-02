package chap_05;

public class _Quiz_05 {
	public static void main(String[] args) {
		
		
		// 신발 사이즈는 250 부터 295 까지 5단위로 증가
		// 신발 사이즈는 총 10가지
		
		// 실행결과 : 사이즈 250 (재고 있음)
		
		String[] size = {"250","255","260","265","270","275","280","285","290","295"};
		for (int i = 0; i < size.length; i++) {
			System.out.println("사이즈" + size[i]+"(재고 있음)");
		}
		
		
	System.out.println("---------------------------------");
	
		int[] sizeArray = new int[10];
		for (int i = 0; i < sizeArray.length; i++) {
			sizeArray[i] = 250 + (5 * i );
		}
		
		for (int size2 : sizeArray) {
			System.out.println("사이즈 " + size2 + "(재고 있음)");
			
		}
		
	}

}
