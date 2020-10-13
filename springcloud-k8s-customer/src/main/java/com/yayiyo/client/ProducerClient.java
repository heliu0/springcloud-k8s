package com.yayiyo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "http://producer-service:8082", url = "http://producer-service:8082", fallback = ProducerClientFallback.class)
public interface  ProducerClient {
    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    String  ping();
}

@Component
class ProducerClientFallback implements ProducerClient{

    @Override
    public String ping() {
        return "Error";
    }
}
