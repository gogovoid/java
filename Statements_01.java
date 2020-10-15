package kr.ac.inha.cse.pl;

public class Statements_01 {
	public static void main(String[] args) {
		double pi = 3.141592, radius = 10;
		int area;
        float a = 10.3f;
        double b = 11.7;
        System.out.println(a + b);
		area = (int)(radius * radius * pi);
		System.out.println(area);
		
		if(area >= 300)
			System.out.println("Å©´Ù");
		else
			System.out.println("ÀÛ´Ù");
		
		int score = 77;
// Modern jdk14 support
		String grade = switch(score/10) {
		case 10, 9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		System.out.println(grade);	
		
		
//		for(int i=0; i<3; i++)
//			System.out.println("¾È³ç");
		int i = 0;
		while (i<3) {
			System.out.println("¾È³ç");
			i++;
		}
			
		
//		switch(score/10) {
//		case 10:
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default :
//			System.out.println("F");
//		}		
	}
}