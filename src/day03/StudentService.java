package day03;

public class StudentService {
	
	Student stArr[] = new Student [5];
	
	/**
	 * 학생 5명을 초기화!(생성)
	 */
	public StudentService() {
		System.out.println("StudentService 기본 생성자 호출됨!!!");
		System.out.println("stArr = "+ stArr);
		
//		for(Student st : stArr) {
//			System.out.println(st);
//			
//		}
		stArr[0] = new Student();
		stArr[1] = new Student("희정", 20, "서울");
		stArr[2] = new Student("길동", 10, "서울");
		stArr[3] = new Student("순신", 30, "경남");
		stArr[4] = new Student("세종", 40, "전남");
		
	}
				
	
	
	/**
	 * 전체 학생 조회
	 */
	
	public Student[] selectAll() {
		return stArr;
	}
	
	
	
	/**
	 * name에 해당하는 학생을 정보 조회 
	 **/
	public static void main(String[] args) {
		StudentService service = new StudentService(); //생성자 호출 
		
		//전체학생 조회
		System.out.println("1. 전체학생 조회--------------");
		Student[] arr = service.selectAll();
		System.out.println("arr = "+ arr);
		for(Student st : arr) {
			System.out.print("이름: " + st.name+"\t");
			System.out.print("나이: " + st.age+"\t");
			System.out.print("주소: " + st.addr+"\n");
			
		}
	}

}
