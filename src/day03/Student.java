package day03;
/**
 * 
 * 학생의 정보를 저장하는 객체  =VO, DTO ,DOMAIN 
 *
 */
public class Student {
	String name; //access modifier 올 수 있다
	int age;
	String addr;
	
	public Student() {
	}
	public Student(String name, int age, String addr) {
		//멤버 필드를 초기화 
		this.name = name;// 지역변수 == 전역변수일 때 this
		this.age = age;
		this.addr = addr;
	}
}
