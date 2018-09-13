package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DemoController {

    @RequestMapping("/rtb/rtb_connector_jon")
    public String testGetUri(HttpServletRequest req) {
        return req.getRequestURI();
    }
}
