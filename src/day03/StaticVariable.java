package day03;

public class StaticVariable {
	//Field 선언 = 전역 변수 = 멤버필드
	int i; //인스턴스필드, 객체를 생성해야만 접근 가능 
	static int j; //객체를 생성하지 않고 접근가능, 공유변수
	
	
	//non-static 영역에서 static, this 모두 가능 
	public void aa() {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(j);
		System.out.println(StaticVariable.j);//권장
		
	}
	
	//static 안에서는 non-static, this 모두 안 된다.
	public static void bb() {
		//System.out.println(i);
		//System.out.println(this.i);
		System.out.println(j);
		System.out.println(StaticVariable.j);//권장
	}
	public static void main(String[] args) {
		System.out.println("---non-static variable TEST -------");
		StaticVariable se = new StaticVariable();
		StaticVariable se2 = new StaticVariable();
		StaticVariable se3 = new StaticVariable();
		
		System.out.println("se1 = "+ se);
		System.out.println("se2 = "+ se2);
		System.out.println("se3 = "+ se3);
		
		System.out.println("se1 = "+ se.i);
		System.out.println("se2 = "+ se2.i);
		System.out.println("se3 = "+ se3.i);
		
		// 값 변경
		se.i = 100;
		System.out.println("----값 변경 후 -----");
		System.out.println("se1 = "+ se.i);
		System.out.println("se2 = "+ se2.i);
		System.out.println("se3 = "+ se3.i);
		
		System.out.println("*** static varaiable TEST ***");
		System.out.println("se1 = "+ se.j);
		System.out.println("se2 = "+ se2.j);
		System.out.println("se3 = "+ se3.j);
		
		se.j = 100;
		StaticVariable.j = 50;
		
		
		System.out.println("----값 변경 후 -----");
		System.out.println("se1 = "+ se.j);
		System.out.println("se2 = "+ se2.j);
		System.out.println("se3 = "+ se3.j);
		
		System.out.println();
		
	}//main end
	static {
		//non-static은 접근할 수 없음
		System.out.println("난 메인보다 먼저 실행됩니다.");
	}

}//class end
