package com.scl.cloud.controller;

import com.scl.cloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shengchenglong
 * @version 1.0
 * @since 17/8/15 09:49 JDK} 1.8
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findByUserId(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://localhost:10000/" + id, User.class);
    }
}
