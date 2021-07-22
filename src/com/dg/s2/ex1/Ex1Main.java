package com.dg.s2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.setAge(30);
		member.setId("iu");
		member.setKi(169);
		member.setMuge(70);
		
		System.out.println("========================");
		String id = member.getId();		
		int age = member.getAge();
		int ki = member.getKi();
		int muge = member.getMuge();
		System.out.println(id);
		System.out.println(age);
		System.out.println(ki);
		System.out.println(muge);
		

	}

}
