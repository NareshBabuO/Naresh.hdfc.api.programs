package com.hdfc.task.iopackage;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReadTaskRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter writer = new FileWriter("buffer.txt");

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			String st = null;
			System.out.println("Enter your Data");

			while (!(st = bufferedReader.readLine()).equals("exit")) {
				System.out.println(st);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
