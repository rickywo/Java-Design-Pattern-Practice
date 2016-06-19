/* package whatever; // don't place package name! */

import java.util.*;
import java.util.ArrayList;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
interface walkInterface {
	public void walk();
}

interface runInterface {
	public void run();
}

class B implements walkInterface {
	public	void walk() {
		System.out.print("walk");
	}
}

class A extends B implements runInterface, walkInterface {
	A() {
		System.out.println("A created");	
	}	
	
	public void walk() {
		super.walk();
	}
	
	public void run() {
		walk();
		System.out.println(" rapidly");
	}
}

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		runInterface a = new A();
		a.run();
	}
}
