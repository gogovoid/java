package kr.ac.inha.cse.pl;

public class Expression_01 {
	static int a = 1;
	public static int f() {
		a = 2;
		return 5;
	}
	
	public static void main(String[] args) {
		System.out.println(a + f());
		System.out.println(a);
		
//		int a = 1, i = 7;
//		String k;
//		k = (i%2!=0) ? "홀수" : "짝수"; // 삼항
//		System.out.println(k);		
//		System.out.println(a + 2); // 이항, LISP (+ a 2)
//		System.out.println(++a); // 단항
		
		// 3 * 2 + 1
		// add(1, multiply(3, 2))
		
//		int a = 1, b = 2, c = 3;
//		System.out.println(a - b + c);
		
		// APL : 우결합, 우선순위 동등
		// Ada : a ** b ** c, 지수 연산자는 결합 규칙을 갖지 않아 컴파일 오류 발생
		// (a ** b) ** c, 괄호로 해결
	}
}