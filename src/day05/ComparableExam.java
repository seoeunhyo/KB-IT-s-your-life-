package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExam {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "희정", 20, "서울"));
		list.add(new Student(300, "나영", 30, "대구"));
		list.add(new Student(200, "효리", 25, "부산"));
		list.add(new Student(500, "민영", 23, "대전"));
		list.add(new Student(400, "가영", 27, "서울"));
		
		System.out.println("-------------정렬 전----------------");
		printList(list);
		
		System.out.println("-- 학번을 기준으로 올림차순 정렬 -----");
		Collections.sort(list);
		printList(list);
		
		
		System.out.println("-- 나이를 기준으로 올림차순 정렬 -----");
		List<Student> sortedList = getSortByAge(list);
		printList(sortedList);
	}

	/**
	 * 출력하는 메소드
	 */
	//객체 생성없이 접근 도와주는 키워드 static
	public static void printList(List<Student> list) {
		System.out.println("------ 학생("+list.size()+")명 -------");
		for(Student st : list) {
			System.out.println(st);
		}
		System.out.println("---------------------------------------");
	}

	
	/** 
	 * 나이를 기준으로 정렬하고 싶다.
	 */
	public static List<Student> getSortByAge(List<Student> list){
		//인수로 전달된 데이터를 직접 정렬하면 원본이 변경되기 때문에
		//복사본이 필요하다 
		List<Student> sortedStudentList = new ArrayList<>();
		for(Student st : list) {
			sortedStudentList.add(st);
		}
		Collections.sort(sortedStudentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
			
				return o1.getAge() - o1.getAge();
			}
			
		});
		
		return sortedStudentList;
	}
	


}
