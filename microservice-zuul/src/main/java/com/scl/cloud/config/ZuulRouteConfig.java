package com.scl.cloud.config;

import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shengchenglong
 * @version 1.0
 * @since 17/9/11 13:52 JDK 1.8
 */
@Configuration
public class ZuulRouteConfig {

//    @Bean
//    public PatternServiceRouteMapper patternServiceRouteMapper() {
//
//        return new PatternServiceRouteMapper("(?<name>^.+)-(?<version>v.+$)", "${version}/${name}");
//    }
}
