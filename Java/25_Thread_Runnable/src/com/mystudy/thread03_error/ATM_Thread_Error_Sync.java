package com.mystudy.thread03_error;

class ATM implements Runnable {//러너블 인터페이스 구현 why

	int money;
	
	public ATM() {}
	public ATM(int money) {
		this.money = money;
	}
	
	// 입금 처리
	// synchronized 처리로 사용중인 자원(필드값)에 대한 동기화 처리
	//사용 중에 다른 쓰레드에서 사용하려할 때 대기상태가 됨
	synchronized void add(int money) {
		this.money += money;
		System.out.println(Thread.currentThread() + " - "
				+ "입금 : " + money + ", 잔액" + this.money);
					//작업스레드표시, 입금액은 얼마고 잔액은 얼마고
	}
	
	// 출금 처리
	synchronized void out(int money) {
		this.money -= money;
		System.out.println(Thread.currentThread() + " - "
				+ "출금 : " + money + ", 잔액" + this.money);
					//작업스레드표시, 출금액은 얼마고 잔액은 얼마고
	}
	
	
	@Override //구현 안된 run
	public void run() {
		// 입금 후 계속 출금
		add(1000);
		bankSleep(1000);
		out(500);
		bankSleep(1000);
		out(300);
		bankSleep(1000);
		out(200);		
		// 입금 조작 하는 중에 다른 사람이 데이터를 쓸수 있게 함
	} 
	
	void bankSleep(int millisecond) {
		try {
			Thread.currentThread().sleep(millisecond); 
			//현재 동작중인 currentThread를 1초동안 쉬게!
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}

public class ATM_Thread_Error_Sync {

	public static void main(String[] args) {
		System.out.println("==== main() 시작 ====");
		ATM bank = new ATM();
		System.out.println("은행잔고 : " + bank.money);
		
		Thread th1 = new Thread(bank);
		Thread th2 = new Thread(bank);
		
		th1.start(); //쓰레드로 동작
		th2.start();
		
		System.out.println("==== main() 끝 ====");
	}

}