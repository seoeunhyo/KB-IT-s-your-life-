package day05;


interface A{
	//필드는 public static final 
	//메소드는 public abstract 
	
	int i = 10; //반드시 초기화 필수 
	void aa(); //자동 public 
	abstract  void bb();

}


interface B{
	int cc();
	String dd(int i);
}

class C{
	public void test() {}
	
}


class Test extends C implements A, B {//Test is a A 성립 

	@Override
	public void aa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int cc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String dd(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


public class InterfaceExam {

	public static void main(String[] args) {
		//new A();
		
		A a = new Test();
		B b = new Test();
		C c = new Test();
		c.test();
	}

}
