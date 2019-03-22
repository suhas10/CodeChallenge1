package com.jlp;

import java.util.Scanner;

import com.jlp.format.TimeConverter;

public class App {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			TimeConverter time = new TimeConverter();	
			int seconds;
			System.out.println("Please enter the number");
			seconds = input.nextInt();
			if( seconds < 0)
			{
				System.out.println( time.formatTime(seconds));
			}
			else {
				System.out.println("Formated Time:");
				System.out.println( time.formatTime(seconds));	
			}
			
		}//try
		
		catch(Exception e){
			e.printStackTrace();
		}//catch
		
		finally {
			input.close();
		}//finally
		
	}//main()
}
