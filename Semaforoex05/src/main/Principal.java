package main;

import java.util.concurrent.Semaphore;

import controller.Threadbanco;

public class Principal {

	public static void main(String[] args) {
		int perm=1;
		Semaphore semaforo = new Semaphore(perm);
		for (int idoperacao = 0; idoperacao <21 ; idoperacao++) {
			Thread tBanco = new Threadbanco(idoperacao,semaforo);
			tBanco.start();
		}
	}

}
