package kr.ac.inha.cse.pl;

public class Subprograms_01 {

	public static void baseline() {
		System.out.println("|    |    |    |");
		System.out.println("+----+----+----+");
	}
	static int sum(int ...numbers) {
		int r = 0;
		for(int number : numbers)
			r = r + number;
		return r;
	}	
	public static void main(String[] args) {
		System.out.println(sum(1,5,3));
		System.out.println(sum(3,1));
		System.out.println(sum(1,5,3,7,99));
		System.out.println(sum(11,33,55,1,2,3,4));
//		System.out.println("+----+----+----+");
//		baseline();
//		baseline();
//		baseline();
	}
}