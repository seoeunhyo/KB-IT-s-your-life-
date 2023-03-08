package day05;

public class TestExam {
	public static void aa(int j) {
		j++; ///1증가
	}
	
	public static void bb(AB ab) {
		ab.name = "희정";
	}
	public static void main(String[] args) {
		int j =10;
		aa(j);
		System.out.println(j);
		AB ab = new AB();
		bb(ab);
		System.out.println(ab.name);
	}

}

class AB {
	String name;
}
