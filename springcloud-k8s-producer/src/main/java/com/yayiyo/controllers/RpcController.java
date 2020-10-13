package com.yayiyo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class RpcController {
    @GetMapping("/ping")
    @ResponseBody
    public String ping() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            return "Pong";
        }
    }
}
