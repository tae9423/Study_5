package com.dg.s3;

public class S3Main1 {

	public static void main(String[] args) {
		
		StaticTest.num=2;
		
		System.out.println(StaticTest.num);
		
		StaticTest.staticMethod();
		
		Test2 test2 = new Test2();
		test2.t1();
		
		Test2 test3 = new Test2();
		
		

	}

}
