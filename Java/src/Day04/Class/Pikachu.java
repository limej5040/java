package Day04.Class;

public class Pikachu {
	
	// 클래스 : 객체를 정의하는 설계도
	// 멤버 	: 변수, 메소드
	// 생성자
	// : 객체가 생성될 때, 실행되는 메소드
	// - 객체의 변수를 초기화하는 역할
	// * 생성자의 이름은 클래스의 이름과 동일하다.
	// [ 생성자 정의 ] - 접근지정자 생성자명( 매개변수 ){}
	// [ 메소드 정의 ] - 접근지정자 반환타입 메소드명 ( 매개변수 ) {}

	
	// 변수
	public int energy;
	public String type;
	
	// 생성자
	// * 기본 생성자는 정의하지 않으면 컴파일러가 자동으로 정의해준다 
	// 기본 생성자
	// 생성자 자동 완성 : alt + shift + s : o
	// 메소드 (생성자) 오버로딩 

	public Pikachu() {
//		energy = 100;
//		type = "전기";
		this(100,"전기");
	}
	
	public Pikachu (int energy) {
		this(energy, "전기");
	}
	
	
	// 매개 변수가 있는 생성자 

	public Pikachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}

	
	// 메소드
	// - 접근지정자 반환타입 메소드명 ( 매개변수 ) {}
	public String aAttack() {
		return "십만볼트";
	}
	

	public String bAttack() {
		return "전광석화" ;
	}
	
	/*
	 * 	toString()
	 * 	:반환하는 문자을 객체의 출력으로 대체해주는 메소드 
	 */

	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}
	
	
}
