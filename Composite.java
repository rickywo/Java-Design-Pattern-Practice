/* package whatever; // don't place package name! */

import java.util.*;
import java.util.ArrayList;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
abstract class component {
	abstract void print();	
}

class A extends component {
	A() {
		System.out.println("A created");	
	}	
	
	void print() {
		System.out.println("print A");
	}
}

class Composite extends component {
	private List<component> list = new ArrayList<component>();
	Composite() {
		System.out.println("Composite created");	
	}
	
	void add(component c) {
		list.add(c);
	}
	
	void remove(component c) {
		list.remove(c);
	}
	
	void print() {
		for(component c: list) {
				c.print();
		}
	}
}

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		A a = new A();
		A b = new A();
		Composite comp = new Composite();
		comp.add(a);
		comp.add(b);
		comp.print();
	}
}
