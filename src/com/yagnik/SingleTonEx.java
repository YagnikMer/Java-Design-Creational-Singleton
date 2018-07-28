package com.yagnik;

class SingleTonEx {

	//private constructor to force use of getInstance() to create Singleton object
	private static final SingleTonEx obj= new SingleTonEx();
	
	private SingleTonEx() {}
	
	public static SingleTonEx getInstance(){
		return obj;
	}
}