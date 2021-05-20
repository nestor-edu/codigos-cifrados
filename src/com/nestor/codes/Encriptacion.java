package com.nestor.codes;

public class Encriptacion {
	public static void main(String[] args) {
		String mensaje = "socorro";
		
		String newStr = "";
		
		for (int i = 0; i < mensaje.length(); i++) {
			char c = Character.toLowerCase(mensaje.charAt(i));
			switch (c) {
			case 'b':
				newStr += "0";
				break;
			case 'a':
				newStr += "1";
				break;
			case 'c':
				newStr += "2";
				break;
			case 'e':
				newStr += "3";
				break;
			case 'd':
				newStr += "4";
				break;
			case 'i':
				newStr += "5";
				break;
			case 'f':
				newStr += "6";
				break;
			case 'o':
				newStr += "7";
				break;
			case 'g':
				newStr += "8";
				break;
			case 'u':
				newStr += "9";
				break;
			default:
				newStr += mensaje.charAt(i);
				break;
			}
		}
		System.out.println("Mensaje encriptado: " + newStr + "\t(BACEDIFOGU)");
	}
	
}
