package com.samcgardner.pinkflamingo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.LinkedList;
import java.util.List;

@Path("/")
public class PinkFlamingoResource {

    @GET
    @Path("pink-flamingo")
    public List<String> pinkFlamingo() {
        return new LinkedList<>();
    }

}
