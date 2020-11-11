package kr.ac.inha.cse.pl;

public class ThreadTest {
	public static void main(String[] args) {
		Thread gugu = new Thread(new Gugudan());
		gugu.start(); 
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi I'm main thread~");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Gugudan implements Runnable {
	@Override
	public void run() { // 쓰레드 실행
		for (int dan = 2; dan < 10; dan++) {
			for (int n = 1; n < 10; n++)
				System.out.println(dan + " * " + n + " = " + (dan * n));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}