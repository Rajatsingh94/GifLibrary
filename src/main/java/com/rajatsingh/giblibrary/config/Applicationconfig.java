package com.rajatsingh.giblibrary.config;

import org.hashids.Hashids;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Rajat on 11/13/2017.
 */

@Configuration
@PropertySource("app.properties")
public class Applicationconfig {

    @Autowired
    private Environment env;

    @Bean
    public Hashids hashids(){
        return new Hashids(env.getProperty("giflib.hash.salt"),8);
    }
}
