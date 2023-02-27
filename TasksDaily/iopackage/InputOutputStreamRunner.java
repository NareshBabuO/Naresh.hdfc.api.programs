package com.hdfc.task.iopackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutputStreamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fileReader = new FileReader("input.txt");

			FileWriter fileWriter = new FileWriter("output.txt");

			int f = 0;

			while ((f = fileReader.read()) != -1) {
				System.out.print((char) f);
				fileWriter.write(f);
				fileWriter.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
