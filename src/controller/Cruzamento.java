package controller;

import java.util.concurrent.Semaphore;

public class Cruzamento extends Thread{
	
	private int id; 
	private Semaphore semaforo;
	
	public Cruzamento(int id, Semaphore semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}
	
	@Override
	public void run() {
		try {
			semaforo.acquire();
			sentido();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			semaforo.release();
		}
	}

	private void sentido() {
		switch (id) {
		case 1:
			System.out.println("O "+id+"o. carro virou para sul");
			break;
		case 2:
			System.out.println("O "+id+"o. carro virou para leste");
			break;
		case 3:
			System.out.println("O "+id+"o. carro virou para oeste");
			break;
		case 4:
			System.out.println("O "+id+"o. carro virou para norte");
			break;

		default:
			break;
		}
	}
	
	
}
