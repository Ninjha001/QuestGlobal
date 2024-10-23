package com.threading.www;

class MyThread5 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}
}

class ThreadDemo8 {
	public static void main(String[] args) {
		MyThread5 thread = new MyThread5();
		thread.setPriority(10);
		thread.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}
}
