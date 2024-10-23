package com.threading.www;

class MyThreadClass extends Thread {
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		MyThreadClass thread = new MyThreadClass();
		thread.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
	}
}
