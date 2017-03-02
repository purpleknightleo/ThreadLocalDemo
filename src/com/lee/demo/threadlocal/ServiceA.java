package com.lee.demo.threadlocal;
public class ServiceA {

	private ServiceB b;

	public ServiceA() {
		b = new ServiceB();
	}

	public void a() {
		MessageContext.getInstance().setMessage(new Message("hello"));
		b.b();
	}

}
