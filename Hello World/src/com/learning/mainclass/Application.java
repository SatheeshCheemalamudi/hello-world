package com.learning.mainclass;

import com.learning.method.HelloWorld;
import com.learning.method.Parent;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld helloworld = new HelloWorld();
		System.out.println(Parent.MY_NAME);
		Parent.myStaticMethod();
		
		helloworld.learning();
		int d= helloworld.add();
		System.out.println(helloworld.subtract(d, 3));
		System.out.println(helloworld.add(1, 2));
		
		System.out.println("add "+d);
		

	}

}
