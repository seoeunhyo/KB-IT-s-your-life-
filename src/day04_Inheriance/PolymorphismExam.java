package day04_Inheriance;

class CarCenter{
	//매개변수를 이용한 다형성
	public void engineer(Car cd){
		//cd.a -> 부모 타입으로는 자식부분 접근불가
		//접근이 가능하도록 하기 위해서는 ObjectDownCasting을 한다.
		
		if(cd instanceof EfSonata) {//상속관계일때만 사용 가능
			EfSonata efs = (EfSonata)cd; //부모>자식 -> ObjectDownCasting
			System.out.println("cd = "+efs.a);
			System.out.print(cd.carname+" 수리완료!\t");
			System.out.println("청구비용"+cd.cost+" 원");
		}
	}
}


public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		EfSonata efs=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		
		Car car= new Car();

		cc.engineer(ca);
		System.out.println("efs.a = "+efs.a);
		
		System.out.println("ca = "+ca);
		System.out.println("ca.a = "+ca.a);
		
		cc.engineer(car);// 주소가 담기는 것 
		cc.engineer(efs);//
		cc.engineer(ca);//
		cc.engineer(ex);//
	
	
	}
}
