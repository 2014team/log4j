package com.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogTest {
	
	static Log log = LogFactory.getLog(LogTest.class);
	
	public static void main(String[] args) {
		log.info("start........");
		try {
			int i = 1/0;
		} catch (Exception e) {
			log.error(e);
		}
		
		log.info("end........");
	}

}
