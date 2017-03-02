package com.lee.demo.threadlocal;

public class MessageContext {

	private static final MessageContext instance = new MessageContext(); // singleton
	
	private MessageContext(){}
	
	public static MessageContext getInstance(){
		return instance;
	}
	
	private ThreadLocal<Message> message = new ThreadLocal<Message>();
	
	public void setMessage(Message value){
		this.message.set(value);
	}
	
	public Message getMessage(){
		return this.message.get();
	}
	
}
