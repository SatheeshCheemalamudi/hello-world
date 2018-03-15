/**
 * 
 */
package com.learning.method;

/**
 * @author SCHEEMA
 *
 */
public class Parent {
	// rgbt
	
	public static String MY_NAME="Satheesh";
	
	public void test(){
		HelloWorld hw= new HelloWorld();
		System.out.println("");
		mystaticMethod2();
	}
	
	public static void myStaticMethod(){
		System.out.println("Acessing static methods from other classes");
		mystaticMethod2();
	}
	
	public static void mystaticMethod2(){
		System.out.println("New Static 2");
	}

}
