package com.Drug.Drugs.exception;

@SuppressWarnings("serial")
public class CustomException extends Exception {
	String message;
	public CustomException(String str) {
		message = str;
	}
		public CustomException() {
		
	    }
}