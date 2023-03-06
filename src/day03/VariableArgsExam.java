package day03;

public class VariableArgsExam {
	
	public static void aa(int i) {
		
	}
	
	public static void bb(int ... i) {
		System.out.println("i = " + i);
		System.out.println("i.length = " + i.length);
		
		for(int j: i) {
			System.out.print(j+" ");
			
		}
		
		System.out.println("\n=======================");
		
	}
	
	public static void cc(String s, int ... i) {
		
	}
	
	public static void main(String[] args) {
		//aa(3);
		//aa();
		bb();
		bb(3);
		bb(1,3,5,7,9);
		
	}

}
