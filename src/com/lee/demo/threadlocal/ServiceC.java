package com.lee.demo.threadlocal;
public class ServiceC {

	public void c() {
		Message message = MessageContext.getInstance().getMessage();
		System.out.println("data = " + message.getData());
	}

}
