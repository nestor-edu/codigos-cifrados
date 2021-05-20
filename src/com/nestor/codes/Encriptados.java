package com.nestor.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encriptados {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Ingrese mensaje: ");
		String mensaje = br.readLine();
		
		String octal = "";
		for (char c : mensaje.toCharArray()) {
			octal += Integer.toOctalString(c) + " ";
		}
		
		System.out.println(octal);
		
	}
}
