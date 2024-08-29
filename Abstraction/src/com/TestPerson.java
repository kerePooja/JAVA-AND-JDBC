package com;

public class TestPerson {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.work();
		//we can do lyk this also but it will not hise the implimentation
		
		Person p=new Employee();
		p.work(); //to hide the impimentation we are doing lyk this

	}

}
