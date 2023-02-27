package com.hdfc.bank.charstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderStreamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		try {
			FileWriter fileWriter = new
					FileWriter("input.txt");
			
			BufferedReader br = new BufferedReader(new 
					InputStreamReader(System.in));
			
			String str=null;
			System.out.println("Enter your data");
			
			while(!(str=br.readLine()).equals("exit")) {
				System.out.println(str);
			}
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
