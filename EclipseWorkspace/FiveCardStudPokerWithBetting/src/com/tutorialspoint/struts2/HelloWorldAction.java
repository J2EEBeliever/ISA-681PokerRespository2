package com.tutorialspoint.struts2;

import org.apache.log4j.Logger;

public class HelloWorldAction {

	   private String name;
	   
		final static Logger log = Logger.getLogger(HelloWorldAction.class);

	   public String execute() throws Exception {
		   
	      log.debug("Debug: HelloWorldAction:  execute()");
	      log.info("Info: HelloWorldAction: execute()");
	      
	      return "success";
	      
	   }
	   
	   public String getName() {
		   
	      log.debug("Debug: HelloWorldAction: getName()");
	      log.info("Info: HelloWorldAction: getName()");

	      return name;
	   }

	   public void setName(String name) {

	      log.debug("Debug: HelloWorldAction: setName(name)");
	      log.info("Info: HelloWorldAction: setName(name)");
	      
	      this.name = name;
	   }
	}
