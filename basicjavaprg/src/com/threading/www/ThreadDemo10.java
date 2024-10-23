package com.threading.www;

class Sita extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Sita Thread");
		}
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

class ThreadDemo10 {
	public static void main(String[] args) throws InterruptedException {
		Sita thread = new Sita();
		thread.start();
		thread.join();
		for(int i=0;i<10;i++) {
			System.out.println("Rama Thread");
		}
	}
}
