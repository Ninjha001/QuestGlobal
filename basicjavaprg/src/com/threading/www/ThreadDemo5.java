package com.threading.www;

class MyThread2 extends Thread{
	public void run() {
		System.out.println("run()");
	}
}

class ThreadDemo5 {
	public static void main(String[] args) {
		MyThread2 thread = new MyThread2();
		Thread thread1 = new Thread(thread);
		thread1.start();
		System.out.println("main method");
	}
}
