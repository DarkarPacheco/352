package com.mycompany.determinaetapas;

import java.io.*; 
public class App {

    public static void main(String[] args) throws IOException {
        
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		System.out.println("Dame la edad");
		edad = Integer.parseInt(bufEntrada.readLine());
		if (edad>0) {
			if (edad>5) {
				if (edad<18) {
					System.out.println("Es un niño");
				} else {
					System.out.println("Eres adulto");
				}
			} else {
				System.out.println("infante");
			}
		} else {
			System.out.println("No se pueden edades menores a 0");
		}
	}


}
    