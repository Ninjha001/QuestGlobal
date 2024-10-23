package com.threading.www;

class MyThread4 extends Thread{}

class ThreadDemo7 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		MyThread4 thread = new MyThread4();
		System.out.println(thread.getPriority());
		thread.setPriority(10);
		System.out.println(thread.getPriority());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(thread.getPriority());
	}
}
