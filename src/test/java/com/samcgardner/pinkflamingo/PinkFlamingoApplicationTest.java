package com.samcgardner.pinkflamingo;

import io.dropwizard.Configuration;
import io.dropwizard.testing.junit.DropwizardAppRule;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.junit.ClassRule;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;

public class PinkFlamingoApplicationTest {

    @ClassRule
    public static final DropwizardAppRule<Configuration> RULE =
            new DropwizardAppRule<>(PinkFlamingoApplication.class);

    @Test
    public void returnsListOfPinkFlamingos() {
        Client client = JerseyClientBuilder.createClient();

        Response response = client.target(
                String.format("http://localhost:%d/pink-flamingo", RULE.getLocalPort()))
                .queryParam("from", 0)
                .queryParam("to", 11)
                .request()
                .get();

        assertEquals(200, response.getStatus());
        assertEquals("[\"Pink Flamingo\",\"Flamingo\",\"Flamingo\",\"Flamingo\",\"4\",\"Flamingo\",\"Fizz\",\"7\",\"Flamingo\",\"Fizz\",\"Buzz\"]", response.readEntity(String.class));
    }

}

