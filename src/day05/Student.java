package day05;

public class Student implements Comparable<Student>{
	private int sno;
	private String name;
	private int age;
	private String addr;
	
	
	public Student() {
		
	}


	public Student(int sno, String name, int age, String addr) {
		super();
		this.sno = sno;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}


	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [sno=");
		builder.append(sno);
		builder.append(", name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}
	
	
	/**
	 * 현재 객체와 인수로 전달된 객체를 비교한다.
	 * return 값이 음수, 0, 양수에 따라 정렬이 된다.
	 * 
	 */
	@Override
	public int compareTo(Student st) {
		return sno - st.getSno(); //왼쪽 - 오른쪽 / 왼쪽>오른쪽 = 양수 
	}
	
}
