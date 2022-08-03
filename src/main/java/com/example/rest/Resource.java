package com.example.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/restapi")
public class Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @Consumes(MediaType.TEXT_PLAIN)
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String Posthello(String name) {
        return "Hello "+name;
    }
}