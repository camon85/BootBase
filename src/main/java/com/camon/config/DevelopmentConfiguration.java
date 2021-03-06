package com.camon.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by jooyong on 2015-12-20.
 */
@Configuration
@Profile("development")
@Slf4j
public class DevelopmentConfiguration extends CommonConfiguration {
    static {
        log.info("### DevelopmentConfiguration");
    }

}
