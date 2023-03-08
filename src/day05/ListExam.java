package day05;

import java.util.ArrayList;

public class ListExam extends ArrayList<Integer>{ //객체만 저장 가능

	public ListExam() {
		super(6); //6개의 공간이 만들어짐, 크기 자동 확장 가능 
		
		super.add(3);//AutoBoxing
		this.add(5);
		add(1);
		super.add(7);
		
		
		
		System.out.println("저장된 개수 = "+super.size());
		
		for(int i =0; i<super.size();i++) {
			int no = super.get(i); //UnBoxing
			System.out.print(no+" ");
		}
		System.out.println();
		
		//제거 ***
		super.remove(2);
		
		for(int i =0; i<super.size();i++) {
			int no = super.get(i); //UnBoxing
			System.out.print(no+" ");
		}
		System.out.println();
		System.out.println(this); // == this.toString()
		System.out.println(this.get(2));
	}
	
	
	public static void main(String[] args) {
		
		new ListExam(); //객체가 생성될때 생성자 호출 
		//ListExam 생성될 때 ArrayList의 생성자가 호출된다 

	

}
}