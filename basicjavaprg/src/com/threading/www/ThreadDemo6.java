package com.threading.www;

class MyThread3 extends Thread{}

class ThreadDemo6 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread3 thread = new MyThread3();
		System.out.println(thread.currentThread().getName());
		System.out.println(thread.getName());
		thread.currentThread().setName("Neeru Kunjh");
		System.out.println(thread.currentThread().getName());
		
	}
}
