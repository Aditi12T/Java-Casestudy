package com.book.Exception;

public class InvalidBookException extends Exception{
	public static void main(String args[]) {
		try {
			throw new InvalidBookException();
		}
		catch(InvalidBookException ex) {
			System.out.println("Caught an Exception");
			System.out.println(ex.getMessage());
		}
	}
}
