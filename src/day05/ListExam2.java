package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam2 extends ArrayList<Integer>{ //객체만 저장 가능
	List<Integer> list = new ArrayList<Integer>(3);
	
	
	public ListExam2() {
		
		list.add(9);//AutoBoxing
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(8);
		list.add(3);
		
		//정렬
		//Collections.sort(list);
		
		System.out.println("정렬 후: "+list);
		//System.out.println("저장된 개수 = "+super.size());
		
		for(int i =0; i<list.size();i++) {
			int no = list.get(i); //UnBoxing
			System.out.print(no+" ");
		}
		System.out.println();
		
		//제거 ***
//		list.remove(2);
//		
//		for(int i =0; i<list.size();i++) {
//			int no = list.get(i); //UnBoxing
//			System.out.print(no+" ");
//		}
//		System.out.println();
//		System.out.println(list); // == this.toString()
//		System.out.println(list.get(2));
//	}
	
	}
	public static void main(String[] args) {
		
		new ListExam2(); //객체가 생성될때 생성자 호출 
		//ListExam 생성될 때 ArrayList의 생성자가 호출된다 

	

}
}