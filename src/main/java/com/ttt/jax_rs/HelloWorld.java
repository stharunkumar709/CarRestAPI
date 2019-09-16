package com.ttt.jax_rs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")	
public class HelloWorld {
	
	@GET	
	@Produces(MediaType.TEXT_PLAIN)
	public List<String> getHello()
	{
		String[] str= {"tharun","kumar","reddy"};
		
		List<String> arr=Arrays.asList(str);
		return arr;
	}
}
