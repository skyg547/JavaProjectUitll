package com.ho.rest;

@Path("myresource")
public class MyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "{id:1, message:\"this is RESTful app sample!\"}";

    }
}
