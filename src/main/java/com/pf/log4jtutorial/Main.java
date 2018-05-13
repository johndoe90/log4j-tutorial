package com.pf.log4jtutorial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.apache.logging.log4j.Level;

@SpringBootApplication
@EnableScheduling
public class Main {

	private static Logger logger = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	@Scheduled(fixedRate = 5000)
	public void log() {
		logger.log(Level.DEBUG, "DEBUG");
		logger.log(Level.INFO, "INFO");
		logger.log(Level.WARN, "WARN");
		
		System.out.println("SYSOUT WORK BRANCH");
	}
}
