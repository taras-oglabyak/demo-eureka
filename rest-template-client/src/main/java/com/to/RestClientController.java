package com.to;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestClientController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/get-port")
    public String greeting() {
        return restTemplate.getForObject("http://tarez-client-app/port", String.class);
    }

}
