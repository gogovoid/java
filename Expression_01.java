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
//		k = (i%2!=0) ? "Ȧ��" : "¦��"; // ����
//		System.out.println(k);		
//		System.out.println(a + 2); // ����, LISP (+ a 2)
//		System.out.println(++a); // ����
		
		// 3 * 2 + 1
		// add(1, multiply(3, 2))
		
//		int a = 1, b = 2, c = 3;
//		System.out.println(a - b + c);
		
		// APL : �����, �켱���� ����
		// Ada : a ** b ** c, ���� �����ڴ� ���� ��Ģ�� ���� �ʾ� ������ ���� �߻�
		// (a ** b) ** c, ��ȣ�� �ذ�
	}
}