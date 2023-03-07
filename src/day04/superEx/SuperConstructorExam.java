package day04.superEx;

class Animal{
	int legs =4;
	String name = "animal";
//	Animal(){
//		System.out.println("Animal의 1...");
//		
//	}
	Animal(int i){
		System.out.println("Animal(int i) 2...");
	}
	Animal(String s){
		System.out.println("Animal(String) 3...");
	}
	
	/**
	 * 소리 낸다.
	 */
	public void sound() {
		System.out.println("으~~엉...");
	}
	/**
	 * 달린다.
	 */
	public void run() {
		System.out.println("잘 뛴다!!!!");
	}
	
}

class Pig extends Animal{ //Pig is a Animal 성립(다형성)
	int legs = 2;
	int age = 5;
	Pig(){
		this(4);//int형 받는 자기 자신 생성자 호출 
		System.out.println("Pig() 3...");
		
		
		//변수 접근!!
		System.out.println(legs);//2
		System.out.println(this.legs);//2
		System.out.println(super.legs);//4
		
		System.out.println("--------------------------------");
		//변수 접근!!
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		
		
		System.out.println("--------------------------------");
		//변수 접근!!
		System.out.println(age);
		System.out.println(this.age);
		//System.out.println(super.age); -> 에러 
	}
	Pig(int i){
		super(i);
		System.out.println("Pig(int i) 4...");
	}
	Pig(boolean b){
		super(b+"안녕");
		System.out.println("Pig(boolean b) 5...");
	}
	
	@Override
		public void sound() {//@Annotation :컴파일러에게 재정의 알려줌. 성능향상
			System.out.println("꿀꿀~~~~~~");
			
		}
	
//	@Override
//		public void run() {
//			System.out.println("못 뛴다~~~~");
//	}
	
	public void eat() {
		System.out.println("너무 많이 먹는다!");
	}
}

//////////////////////////////////////////////////////////////////////


public class SuperConstructorExam {
	public static void main(String[] args) {
		//new Pig("안녕"); //컴파일 오류 
		//결론: 모든 자식 생성자 구현부 첫번째 줄에는 super() 생략되어있다.
		//		반드시 부모의 기본 생성자가 필요하다.
		
		
		//만약 1,2,3, 없다면 (부모의 생성자가 없다면)

		//부모의 생성자가 하나도 없으면 기본 생성자가 자동으로 삽입되므로
		//문제없음 
		new Pig(5);
		//만약, 부모의 생성자가 2,3 만 있다면,,,,,(기본 생성자가 없다면)
		//결론 : 모든 자식 생성자 구현부 첫줄에서 에러난다.
		// 자식 생성자 구현부 첫줄에서 다른 생성자를 강제로 호출해야한다. 
		////////////////////////////////////////////////////
		
		
		Pig pig = new Pig();
		pig.sound(); //재정의 
		pig.run(); //
		
		System.out.println("---------------다형성--------------");
		Animal animal = new Pig(); //다형성(부모타입부분만 접근가능)
		System.out.println("-------------속성출력----------------");
		System.out.println(animal.legs);
		System.out.println(animal.name);
		
		
		//System.out.println(animal.age); //자식부분 접근불가 
										//가능하려면 objectDowncasting
		animal.sound();
		//재정의된 메소드는 무조건 자식 메소드가 호출된다. (부모타입일지라도)
		animal.run();
		//animal.eat();  => 접근불가!
		
		
		if(animal instanceof Pig) {
			Pig p = (Pig)animal;
			System.out.println(p.age);
			p.eat();
		}
		
	}
}
