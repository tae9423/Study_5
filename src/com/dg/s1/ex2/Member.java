package com.dg.s1.ex2;

class Member {
	
	public String id;
	
	int age; //접근지정자가 default
	
	private String name;
	
	
	private Member() {
		this.id = "iu";
		this.age = 29;
		this.name = "choa";
	}
	
	public Member test() {
		return new Member();
	}

}
