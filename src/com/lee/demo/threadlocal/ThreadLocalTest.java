package com.lee.demo.threadlocal;
/**
 * ʹ��ThreadLocalʵ���ڲ����ݲ�������demo���跽��������ΪServiceA.a() -> ServiceB.b() -> ServiceC.c()��
 * ���c()����Ҫ��ȡһ��Message��ֵ���Ҹ�ֵ�ĸ�ֵ����a()�У�����Ҫ����ֵһ·��a()�Բ�������ʽ���ݵ�c()�����Խ�Message����Ϊ
 * ThreadLocal��������a()��set����c()��get
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
