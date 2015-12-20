package com.camon.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jooyong on 2015-12-20.
 */
@Configuration
@Slf4j
public class CommonConfiguration {
    static {
        log.info("### CommonConfiguration");
    }
}
