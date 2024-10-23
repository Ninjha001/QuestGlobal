package com.threading.www;

class MyThread1 extends Thread{
	public void start() {
//		super.start();
		System.out.println("start method");
	}
	public void run() {
		System.out.println("run method");
	}
}

class ThreadDemo3 {
	public static void main(String[] args) {
		MyThread1 thread = new MyThread1();
		thread.start();
	}
}
