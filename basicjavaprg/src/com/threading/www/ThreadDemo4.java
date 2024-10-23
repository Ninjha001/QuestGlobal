package com.threading.www;

import java.util.Iterator;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
		}
	}
}

class ThreadDemo4 {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}
	
}
