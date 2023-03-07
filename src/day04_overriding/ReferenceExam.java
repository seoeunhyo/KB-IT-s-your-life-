package day04_overriding;


class ObjectExam{
	String str;
	public ObjectExam(){   }
	public ObjectExam(String str){  
		this.str = str + "=" + super.toString();
	}
	
	
	@Override
	public String toString() {
	
		return str;
	}
}
class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			
			String s01="장희정"; 
			String s02="Java";
			if(s01 ==s02) {
				
			}
			//String의 문자열 비교할때는 equals() 전용 사용
			if(s01.equals(s02)) {//true이면 같다, 아니면 다르다 
				
			}
			String s03=new String("월요일");
			
			ObjectExam oe1=new ObjectExam("언제 쉴거야?");
			ObjectExam oe2=new ObjectExam("안녕");
			
			System.out.println(c);//
			
			/**
			 * println(Objest obj) 메소드는 
			 * 인수로 객체가 전달되면 obj.toString()을 자동으로 호출한다.
			 * totString이 리턴하는 값을 출력 
			 */
			System.out.println(s01);//장희정
			System.out.println(s02);//Java
			System.out.println(s03);//월요일
			
///////////////////////////////////////////////////////
			
			System.out.println(oe1);//주소 값
			System.out.println(oe2);//주소 값 
	}
}
