package gg;

import java.io.*;

//SQ:138
public class G63A {
	
	public void main(String fileName) throws IOException{ }

	
	
}


/*

A.java:
public class A {
	
	public void a(){} 					==> method ve variable ayni isim olabilir. 
	int a;
	
}

B.java:
public class B {
	
	private int doStuff() {				==> local variable private olur mu? 
		private int x = 100;				El-cevab:No,it is a syntax error, you can not declare any variable with an access modifiers within a method.
		return x++;									You can have private fields in a class, but this is different. 
	}												Variables inside method are considered local and can't have modifiers.
}													You can do it by defining inner class and declaring private variables inside that.
													In fact, the only modifier that you can use on a local variable declaration is final.
													
										#	variables : # http://www.fredosaurus.com/notes-java/data/variables/45local-inst-class.html		 
													 
													 
C.java: 			
import java.io.*;
package p1;
class A {							==> C.java:1: error: class A is public, should be declared in a file named A.java public class A {

	public void main(String fileName) throws IOException{ }

}

*/


/*
 	Which statement is true?
 	
	A. Only the A.Java file compiles successfully.
	B. Only the B.java file compiles successfully.
	C. Only the C.java file compiles successfully.
	D. The A.Java and B.java files compile successfully.
	E. The B.java and C.java files compile successfully.
	F. The A.Java and C.java files compile successfully.
	
	
	
	Answ: A
	
 */


















