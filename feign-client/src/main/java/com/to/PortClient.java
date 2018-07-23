package com.to;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("tarez-client-app")
public interface PortClient {

    @RequestMapping("/port")
    String port();

}
