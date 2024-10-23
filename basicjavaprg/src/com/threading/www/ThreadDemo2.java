package com.threading.www;

class MyThread extends Thread{
	public void run() {
		System.out.println("no argument run()");
	}
	public void run(int i) {
		System.out.println("int argument run()");
	}
}

class ThreadDemo2 {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
//		thread.run(0);
	}
}
