package com.hdfc.bank.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter writer = new FileWriter("output.txt");

			FileReader reader = new FileReader("input.txt");

			int n = 0;

			while ((n = reader.read()) != -1) {

				System.out.print((char) n);

				writer.write(n);

				writer.flush();

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
