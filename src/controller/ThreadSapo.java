package controller;

import view.Main;

public class ThreadSapo extends Thread {
	
	private int distanciaCorrida;
	private int maxSaltos;
	
	public ThreadSapo(int maxSalto, int distancia) {
		maxSaltos = maxSalto;
		distanciaCorrida = distancia;
	}
	
	@Override
	public void run() {
		correr();
	}

	private void correr() {
		int salto;
		int distanciaTotal =0;
		do {
			salto = (int) (Math.random() * (maxSaltos + 1));
			distanciaTotal+=salto;
			System.out.println("Sapo #"+getId()+" pulou "+salto
					+" metros! Distancia total de: "+distanciaTotal+" metros.");
		}while(distanciaTotal < distanciaCorrida);
		System.out.println("Sapo #"+getId()+" chegou em "+(++Main.podio)+"°!");
	}
	
}
