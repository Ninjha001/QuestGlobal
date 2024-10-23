package com.threading.www;

class MyThread6 extends Thread{
	public void run() {
		Thread.yield();
		for(int i=0;i<10;i++) {
			System.out.println("child thread");			
		}
	}
}

class ThreadDemo9 {
	public static void main(String[] args) {
		MyThread6 thread = new MyThread6();
		thread.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");			
		}
	}
}
