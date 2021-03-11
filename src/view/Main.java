package view;

import controller.ThreadSapo;

public class Main {
	
	public static int podio = 0;
	
	public static void main(String[] args) {
		
		int distanciaCorrida = 10;
		int maxSaltos = 5;
		
		Thread s1 = new ThreadSapo(maxSaltos, distanciaCorrida);
		s1.start();
		
		Thread s2 = new ThreadSapo(maxSaltos, distanciaCorrida);
		s2.start();
		
		Thread s3 = new ThreadSapo(maxSaltos, distanciaCorrida);
		s3.start();
		
		Thread s4 = new ThreadSapo(maxSaltos, distanciaCorrida);
		s4.start();
		
		Thread s5 = new ThreadSapo(maxSaltos, distanciaCorrida);
		s5.start();
		
	}
}
