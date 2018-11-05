package com.samcgardner.pinkflamingo.resource;

import com.samcgardner.pinkflamingo.lib.PinkFlamingoService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Path("/")
public class PinkFlamingoResource {

    @GET
    @Path("pink-flamingo")
    @Produces("application/json")
    public List<String> pinkFlamingo(@QueryParam("from") int from, @QueryParam("to") int to) {
        return IntStream.range(from, to)
                .boxed()
                .map(PinkFlamingoService::fizzBuzzWithPinkFlamingo)
                .collect(Collectors.toList());
    }

}
