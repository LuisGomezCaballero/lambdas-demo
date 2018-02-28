package com.luisgomezcaballero.lambdas;

public class Main {

	public static void main(String[] args) {

		// Interface example without lambda

		MyImplementation myImplementation = new MyImplementation();
		myImplementation.myInterfaceMethod();

		// Interface example with lambda

		MyInterface myLambdaFunction = () -> System.out.println("myLambdaMessage");
		myLambdaFunction.myInterfaceMethod();

		// Thread example without lambda

		Thread myNormalThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("myNormalThreadMessage");
			}
		});

		myNormalThread.run();

		// Thread example wit lambda

		Thread myLambdaThread = new Thread(() -> System.out.println("myLambdaThreadMessage"));
		myLambdaThread.run();
	}

}
