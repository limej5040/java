package chap_09;

import java.util.ArrayList;

public class _Quiz_09 {
	// ArrayList 를 이용하여 학생별 프로그래밍 언어 자격증취득 정보를 관리하고, 자바 자격증을 보유한 학생 이름을 출력하시오
	// 학생 이름 및 자격증 취득 정보를 위한 Student 클래스 생성
	// 학생 1인당 보유 자격증은 1개로 제한
	// 모든 클래스는 하나의 파일에 정의
	
	// 학생 이름 및 자격증 취득 정보
	// 이름 : 유재석 , 박명수 , 김종국 ,조세호, 서장훈
	// 자격증 : 파이썬,자바,    자바,   C	, 파이썬
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		
		// 데이터 추가
		list.add(new Student("유재석","파이썬"));
		list.add(new Student("박명수","자바"));
		list.add(new Student("김종국","자바"));
		list.add(new Student("조세호","C"));
		list.add(new Student("서장훈","파이썬"));
		
		System.out.println("자바 자격증을 보유한 학생");
		System.out.println("--------------------------");
		for(Student student : list) {
			if(student.certification.equals("자바")) {
				System.out.println(student.name);
			}
		}
	}

}

class Student {
	public String name;
	public String certification;
	
	public Student(String name, String certification) {
		this.name = name;
		this.certification = certification;
	}
	
}