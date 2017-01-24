package com.fellows.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fellows.entity.Clock;	

@Path("/clock")
public class JSONService {

	@GET
	@Path("{hora}/{minuto}")
	@Produces(MediaType.APPLICATION_JSON)
	public Clock getClockInJSON(@PathParam("hora") int hora, @PathParam("minuto") int minuto) {
		Clock c = new Clock();
		c.setHour(hora);
		c.setMinute(minuto);
		return c;
	}

	@GET
	@Path("{hora}")
	@Produces(MediaType.APPLICATION_JSON)
	public Clock getClockInJSON(@PathParam("hora") int hora) {
		return getClockInJSON(hora, 0);
	}
	
}