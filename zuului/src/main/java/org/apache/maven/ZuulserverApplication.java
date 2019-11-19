package org.apache.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//import org.springframework.boot.context.support.SpringBootServletInitializer;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableZuulProxy
//public class ZuulserverApplication extends SpringBootServletInitializer
public class ZuulserverApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ZuulserverApplication.class, args);
    }
}
