package com.iainsproat.simscaletest.primenumbergenerator.server;


import com.iainsproat.simscaletest.primenumbergenerator.server.controller.PrimeNumberGeneratorController;

import spark.Spark;

/**
 * Responsible for defining routes of the REST API
 * handling requests and returning responses
 *
 *
 * See http://sparkjava.com/documentation.html for documentation of this framework. 
 */
public class API {
	public static void main(String[] args) {
		new PrimeNumberGeneratorController();
		 
		 Spark.exception(Exception.class, (exception, request, response) -> {
			    exception.printStackTrace();
			});
	}
}
