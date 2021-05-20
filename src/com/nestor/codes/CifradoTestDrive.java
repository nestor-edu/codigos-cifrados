package com.nestor.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CifradoTestDrive {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Ingrese mensaje: ");
		String texto = br.readLine();
		Bacedifogu encriptado1 = new Bacedifogu();
		Octal encriptado2 = new Octal();
		Morse encriptado3 = new Morse();
		encriptado1.cifrado(texto);
		encriptado2.cifrado(texto);
		encriptado3.cifrado(texto);
	}
}
