// Enunciado: 129. Fazer um programa para ler um arquivo em Java.

import java.io.*;
public class Main {

	public static void main(String[] args) {
	
		try {
			System.out.println("oi");
			FileReader reader = new FileReader("art.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}