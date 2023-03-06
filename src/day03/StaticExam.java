package day03;

public class StaticExam {//클래스 앞에는 public or 생략

	public static void main(String[] args) {
		System.out.println("*****메인 시작입니다.*****");
		
		//static cc 호출
		Test.cc(5);
		
		//객체 생성해서 aa call
		Test t = new Test();
		System.out.println("t = "+ t);
		
		t.aa();
		System.out.println("*****메인 종료입니다.*****");
		
		
	}

}


///////////////////////////////////////////
/**
 * 하나의 ~.java 문서 안에는 class 여러개 작성 가능 
 * public 클래스는 한개만 존재, 파일명이 되어야하기 때문 
 * main 메소드는 public 클래스 안에 작성한다.
**/


class Test{
	public void aa() {
		System.out.println("aa() call....");
		bb("안녕");
		this.bb("하이");
		System.out.println("this = "+ this);//생성된 현재 객체(주소값)
		
		dd("되니?",5);
		this.dd("되니?",5);//static 안에서만 this 쓸 수 없지만
						   //권장하지는 않는 방법
		Test.dd("되니?", 5);
		
	}
	public int bb(String s) {
		System.out.println("bb(String s) call...");
		return 4;
	}
	public static void cc(int i) {
		System.out.println("cc(int i) call.... i = "+i);
		//dd 호출
			//this.dd() => static 안에서 this 사용 불가 
		//dd("Hello", 3);
		Test.dd("Hi", 5); //권장하는 호출 방법
		
		// non-static 호출해보자!
		//aa(); // static 메소드 안에서 non-static 메소드 호출 불가
	}
	public static char dd(String s, int i) {
		System.out.println("dd(String s, int i) call....");
		return 'A';
	}
}

class A{
	
}

