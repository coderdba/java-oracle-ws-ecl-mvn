package com.gm.oracle.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/MockService")
public class MockService
{
    @GET
    @Path("/get")
    @Produces("application/json")
    public String getResponse()
    {
        System.out.println("In GET");
        		
        String response = "In GET";
        return response;
    }
    
    
    @POST
    @Path("/post")
    public String postResponse()
    {
        System.out.println("In POST");
        
        String response = "In POST";
        return response;
    }
    
}