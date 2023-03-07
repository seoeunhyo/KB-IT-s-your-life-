package day04_Inheriance;

//부모는 각각 / 공유가 아니다 

 class Car{
		public String carname;
		public int cost;
		
		protected void printAttributes(){
			System.out.println("carname = "+carname+"\tcost="+cost);
		}
}

//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
	//각 클래스에 인수를 받지않는 생성자 작성
	//각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당

	 class EfSonata extends Car{
		int a =200;
		EfSonata() {
			this.carname = "sonata";
			cost = 1000;
			//생성자에서 this. / super. / 생략 모두 다 가능
			//중복되는 게 없기 때문
		}
	
	}
	
	class Excel extends Car{
		 Excel() {
			this.carname = "Excel";
			cost = 2000;
		}
	
	}
	 class Carnival extends Car{
		int a =100;
		 Carnival() {
			this.carname = "Carnival";
			cost = 3000;
		}
	
	}
	
public class InheritanceExam{
	//메인메소드에서 
	public static void main(String[] args) {
		
		Car car = new Car();
		EfSonata ef = new EfSonata();
		Excel excel = new Excel();
		Carnival carnival = new Carnival();
		
		System.out.println("1. car");
		ef.printAttributes();
		System.out.println();
		
		System.out.println("2. excel");
		excel.printAttributes();
		System.out.println();
		
		System.out.println("3. carnival");
		carnival.printAttributes();
		System.out.println();
		
		System.out.println("car = "+ car); //주소값: 클래스이름@hashcode
		System.out.println("ef = "+ ef);
		System.out.println("ca = "+ carnival);
		System.out.println("ex = "+ excel);
		
		
	}
}
		//Car, EfSonata, Excel, Canival 네개의 객체를 생성
		// 각 클래스에서 Car calss에있는 printAttributes()메소드를 호출할수있다.
		
