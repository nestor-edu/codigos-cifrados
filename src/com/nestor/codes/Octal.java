package com.nestor.codes;

public class Octal {
	
	public String cifrado(String mensaje) {
		
		String octal = "";
		for (char c : mensaje.toCharArray()) {
			octal += Integer.toOctalString(c) + " ";
		}
		
		return octal;
	}
	
}
