package com.naironics.forageapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping({"/", "/homePage"})
    public String getHomePage() {
        LOGGER.debug("Request Received for Home Page");
        return "homePage";
    }
}