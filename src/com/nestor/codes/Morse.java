package com.nestor.codes;

public class Morse {
	public static void main(String[] args) {
		
		char[] letras = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.',
				'?' };

		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
				"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--", ".-.-.-",
				"..--.." };


		String userInput = "AYUDA".toLowerCase();

		char[] chars = userInput.toCharArray();

		String str = "";
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < letras.length; j++) {

				if (letras[j] == chars[i]) {
					str = str + morse[j] + " ";
				}
			}
		}
		System.out.println("Mensaje encriptado: " + str + "\t(MORSE)");

	}
}
