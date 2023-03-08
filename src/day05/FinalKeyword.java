package day05;

public class FinalKeyword {
	
	final int i; //반드시 초기화 필수, 생성자에서 초기화 가능
	static final int j = 20; //전역변수더라도 자동 초기화 안됨
	int k; //0으로 자동 초기화
	
	public FinalKeyword() {
		i = 50; //final 필드를 생성자를 이용해서 초기화 할 수 있다
		//j =100; 불가, static은 메모리에 올라가 있음 
	}
	
	public FinalKeyword(int value) {
		i = value; 
	}
	public static void main(String[] args) {
		
	}

}
