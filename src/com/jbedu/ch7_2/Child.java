package com.jbedu.ch7_2;

import test.Solider;

public class Child extends Parent{
	
	String schoolName;//학교 이름
	int grade;//학년
	//Parent parent;
	Solider solider;
	
	
	
	public void printSchoolName() {
		System.out.println(this.schoolName);
	}

}
