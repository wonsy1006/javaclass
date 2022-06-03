package javaClass;

public class Bus implements Vehicle {
	
	@Override
	public void run() {
		System.out.println("The bus starts running.");
	}
	
	public void checkFare() {
		System.out.println("Checking your fare.");
	}
}
