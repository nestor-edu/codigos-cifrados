package com.nestor.codes;

public class Octal {
	
	public void cifrado(String mensaje) {
		
		String octal = "";
		for (char c : mensaje.toCharArray()) {
			octal += Integer.toOctalString(c) + " ";
		}
		
		// return octal;
		System.out.println(octal + "\t(BACEDIFOGU)");
	}
	
}
