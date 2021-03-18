package com.singleton;

public class Logger {

	
	private Logger() {
		System.out.println("constroctor private");
		
	}
	
	
	
	public static int id;
	
	
	private static Logger logger;
	
	
	
	public static Logger getInstance() {
		
		if (logger == null) {
			logger= new Logger();
		}
		return logger;
	}
	
	
	
}
				