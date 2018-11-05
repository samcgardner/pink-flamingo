package com.samcgardner.pinkflamingo;

import com.samcgardner.pinkflamingo.resource.PinkFlamingoResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class PinkFlamingoApplication extends Application<Configuration> {

    public static void main(String[] args) throws Exception {
    }


    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
       environment.jersey().register(new PinkFlamingoResource());
    }
}
