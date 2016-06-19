/* package whatever; // don't place package name! */

import java.util.*;
import java.util.ArrayList;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
interface Transmission {
	public void gear();
}


class At implements Transmission {
	public	void gear() {
		System.out.println(" Auto");
	}
}

class M implements Transmission {
	public	void gear() {
		System.out.println(" Manual");
	}
}

abstract class Car {
	Transmission t;
	
	void setTransmission(Transmission t) {
		this.t = t;
	}
	
	abstract void drive();
}

class BMW extends Car {
	
	void drive() {
		System.out.print("BMW drive on");
		t.gear();
	}
}

class VW extends Car {
	
	void drive() {
		System.out.print("VW drive on");
		t.gear();
	}
}

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Transmission auto = new At();
		Transmission manual = new M();
		Car bmw = new BMW();
		Car vw = new VW();
		bmw.setTransmission(auto);
		bmw.drive();
		vw.setTransmission(manual);
		vw.drive();
	}
}
