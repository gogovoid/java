package kr.ac.inha.cse.pl;

class PriorityThread extends Thread{
	public long cnt;
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	PriorityThread(int p){
		setPriority(p); // assign priority
		start(); // thread run
	}
	
	public void run() {
		while(!stop) cnt++;
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		PriorityThread t01 = new PriorityThread(Thread.MIN_PRIORITY);
		PriorityThread t02 = new PriorityThread(1);
		PriorityThread t03 = new PriorityThread(Thread.MIN_PRIORITY);
		PriorityThread t04 = new PriorityThread(10);
//		PriorityThread t05 = new PriorityThread(9);
//		PriorityThread t06 = new PriorityThread(9);
//		PriorityThread t07 = new PriorityThread(Thread.MAX_PRIORITY);
//		PriorityThread t08 = new PriorityThread(9);
//		PriorityThread t09 = new PriorityThread(Thread.MIN_PRIORITY);
//		PriorityThread t10 = new PriorityThread(1);
//		PriorityThread t11 = new PriorityThread(Thread.MIN_PRIORITY);
//		PriorityThread t12 = new PriorityThread(1);
//		PriorityThread t13 = new PriorityThread(9);
//		PriorityThread t14 = new PriorityThread(9);
//		PriorityThread t15 = new PriorityThread(Thread.MAX_PRIORITY);
//		PriorityThread t16 = new PriorityThread(9);
//		PriorityThread t17 = new PriorityThread(Thread.MIN_PRIORITY);
//		PriorityThread t18 = new PriorityThread(1);
//		PriorityThread t19 = new PriorityThread(Thread.MIN_PRIORITY);
//		PriorityThread t20 = new PriorityThread(1);
//		PriorityThread t21 = new PriorityThread(9);
//		PriorityThread t22 = new PriorityThread(9);
//		PriorityThread t23 = new PriorityThread(Thread.MAX_PRIORITY);
//		PriorityThread t24 = new PriorityThread(9);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t01.setStop(true);
		t02.setStop(true);
		t03.setStop(true);
		t04.setStop(true);
		
//		t01.stop();
//		t02.stop();
//		t03.stop();
//		t04.stop();
//		t05.stop();
//		t06.stop();
//		t07.stop();		
//		t08.stop();
//		t09.stop();			
//		t10.stop();
//		t11.stop();
//		t12.stop();
//		t13.stop();
//		t14.stop();
//		t15.stop();
//		t16.stop();		
//		t17.stop();	
//		t18.stop();
//		t19.stop();
//		t20.stop();
//		t21.stop();
//		t22.stop();
//		t23.stop();
//		t24.stop();		

		
		System.out.println("쓰레드 1번 카운팅 값 : " + t01.cnt);
		System.out.println("쓰레드 2번 카운팅 값 : " + t02.cnt);
		System.out.println("쓰레드 3번 카운팅 값 : " + t03.cnt);
		System.out.println("쓰레드 4번 카운팅 값 : " + t04.cnt);
//		System.out.println("쓰레드 5번 카운팅 값 : " + t05.cnt);
//		System.out.println("쓰레드 6번 카운팅 값 : " + t06.cnt);
//		System.out.println("쓰레드 7번 카운팅 값 : " + t07.cnt);
//		System.out.println("쓰레드 8번 카운팅 값 : " + t08.cnt);
//		System.out.println("쓰레드 9번 카운팅 값 : " + t09.cnt);
//		System.out.println("쓰레드 10번 카운팅 값 : " + t10.cnt);
//		System.out.println("쓰레드 11번 카운팅 값 : " + t11.cnt);
//		System.out.println("쓰레드 12번 카운팅 값 : " + t12.cnt);
//		System.out.println("쓰레드 13번 카운팅 값 : " + t13.cnt);
//		System.out.println("쓰레드 14번 카운팅 값 : " + t14.cnt);
//		System.out.println("쓰레드 15번 카운팅 값 : " + t15.cnt);
//		System.out.println("쓰레드 16번 카운팅 값 : " + t16.cnt);
//		System.out.println("쓰레드 17번 카운팅 값 : " + t17.cnt);
//		System.out.println("쓰레드 18번 카운팅 값 : " + t18.cnt);
//		System.out.println("쓰레드 19번 카운팅 값 : " + t19.cnt);
//		System.out.println("쓰레드 20번 카운팅 값 : " + t20.cnt);
//		System.out.println("쓰레드 21번 카운팅 값 : " + t21.cnt);
//		System.out.println("쓰레드 22번 카운팅 값 : " + t22.cnt);
//		System.out.println("쓰레드 23번 카운팅 값 : " + t23.cnt);
//		System.out.println("쓰레드 24번 카운팅 값 : " + t24.cnt);		
	}
}



//package kr.ac.inha.cse.pl;
//
//public class ThreadTest {
//	public static void main(String[] args) {
//		Runnable r = () -> {
//			for (int dan = 2; dan < 10; dan++) {
//				for (int n = 1; n < 10; n++)
//					System.out.println(dan + " * " + n + " = " + (dan * n));
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		};
//		new Thread(r).start();
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Hi I'm main thread~");
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}


//package kr.ac.inha.cse.pl;
//
//public class ThreadTest {
//	public static void main(String[] args) {
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int dan = 2; dan < 10; dan++) {
//					for (int n = 1; n < 10; n++)
//						System.out.println(dan + " * " + n + " = " + (dan * n));
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}		
//		}).start();
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Hi I'm main thread~");
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}


//package kr.ac.inha.cse.pl;
//
//class Gugudan implements Runnable {
//	@Override
//	public void run() {
//		for (int dan = 2; dan < 10; dan++) {
//			for (int n = 1; n < 10; n++)
//				System.out.println(dan + " * " + n + " = " + (dan * n));
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//public class ThreadTest {
//	public static void main(String[] args) {
//		Thread gugu = new Thread(new Gugudan());
//		gugu.start(); 
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Hi I'm main thread~");
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

