package com.rajatsingh.giblibrary.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

/**
 * Created by Rajat on 11/13/2017.
 */
@Configuration
@PropertySource("app.properties")
public class DataConfig {

    @Autowired
    private Environment env;
    @Bean
    public LocalSessionFactoryBean sessionFactory()
    {
        Resource config = new ClassPathResource("hibernate.cfg.xml");
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setConfigLocations(config);
        sessionFactory.setPackagesToScan(env.getProperty("giflib.entity.package"));
        return sessionFactory;
    }

}
