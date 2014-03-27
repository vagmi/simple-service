package com.ca.simpleservice;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("mdo")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

    @POST
    @Path("v1/usage/write_single")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Object doPost(Object o){
        return o;
    }
}
