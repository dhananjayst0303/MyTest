package com.example.demo;

public class Test3 {

	public static void main(String[] args) {

		Employee e1= new Employee(101,"Ram");
		Employee e2= new Employee(201,"Laxman");
		
		Employee e3= new Employee(101,"Ram");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e1.equals(e3));
		
		
		System.out.println(e1);
		System.out.println(e3);
		System.out.println(e1 == e3 );
		
		System.out.println(e1.hashCode() == e3.hashCode() );
		
		System.out.println(e1 = e3 );
		
	}

}
