package com.samcgardner.pinkflamingo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.LinkedList;
import java.util.List;

@Path("/")
public class PinkFlamingoResource {

    @GET
    @Path("pink-flamingo")
    @Produces("application/json")
    public List<String> pinkFlamingo() {
        return new LinkedList<>();
    }

}
