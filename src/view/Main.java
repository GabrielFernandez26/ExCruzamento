package view;

import java.util.concurrent.Semaphore;
import controller.Cruzamento;

public class Main {

	public static void main(String[] args) {
		int qtdCarros = 4;
		Semaphore semaforo = new Semaphore(1);
		for (int id = 1; id <= 4; id++) {
			Thread t = new Cruzamento(id, semaforo);
			t.start();
		}

	}

}
