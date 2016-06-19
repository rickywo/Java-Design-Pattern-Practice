/* package whatever; // don't place package name! */

import java.util.*;
import java.util.ArrayList;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
abstract class Component {
	abstract void print();	
}

abstract class Decorator extends Component {
	Component component;
	Decorator(Component c) {
		this.component = c;
	}
}

class DecoratorA extends Decorator {
	DecoratorA(Component c) {
		super(c);
	}
	
	void print() {
		System.out.print("DecoratorA: ");
		component.print();
	}
}

class DecoratorB extends Decorator {
	DecoratorB(Component c) {
		super(c);
	}
	
	void print() {
		System.out.print("DecoratorB: ");
		component.print();
	}
}

class A extends Component {
	A() {
		System.out.println("A created");	
	}	
	
	void print() {
		System.out.println("print A");
	}
}

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Component a = new A();
		DecoratorA da = new DecoratorA(a);
		DecoratorB db = new DecoratorB(a);
		da.print();
		db.print();
	}
}
