package com.lee.demo.threadlocal;
/**
 * 使用ThreadLocal实现内部传递参数，该demo假设方法调用链为ServiceA.a() -> ServiceB.b() -> ServiceC.c()，
 * 如果c()中需要读取一个Message的值，且该值的赋值是在a()中，不需要将该值一路从a()以参数的形式传递到c()，可以将Message定义为
 * ThreadLocal，并且在a()中set，在c()中get
 * 
 * @author hzlifan
 *
 */
public class ThreadLocalTest {

	public void test(){
		new ServiceA().a();
	}
	
	public static void main(String[] args) {
		ThreadLocalTest test = new ThreadLocalTest();
		test.test();
	}
	
}
