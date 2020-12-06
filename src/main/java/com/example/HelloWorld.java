package com.example;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class HelloWorld {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Greeting sayHello(@QueryParam("name") @DefaultValue("world") String name) {
		return new Greeting("Hello, " + name + "!");
	}

	public static class Greeting {

		private final String message;

		public Greeting(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}
}
