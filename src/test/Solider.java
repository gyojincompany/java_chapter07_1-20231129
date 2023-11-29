package test;

import com.jbedu.ch7_1.People;

public class Solider extends People{

	public Solider(String name, String ssn) {
		super(name, ssn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("군인이름:"+this.name);
	}
}
