package com.lee.demo.threadlocal;
public class ServiceB {

	private ServiceC c;

	public ServiceB() {
		c = new ServiceC();
	}

	public void b() {
		c.c();
	}

}
