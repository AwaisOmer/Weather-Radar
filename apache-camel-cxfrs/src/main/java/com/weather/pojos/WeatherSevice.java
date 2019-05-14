package com.weather.pojos;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
//@Path("/weather")
public class WeatherSevice {
	
	@GET
	@Path("/current") 
	@Produces("application/json")
	@Consumes("application/json")
	public void weatherCurrent(@Context UriInfo info) {
		//System.out.println(un);
			
	}
	
	
	@GET
	@Path("/forecast")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void weatherForecast(@Context UriInfo info){
		
	}

}
