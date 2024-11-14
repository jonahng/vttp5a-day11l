package com.jonah.vttp5a_day11l.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //MUST ANNOTATE WITH @Controller!
public class HomeController {
    
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    

    @ResponseBody
    @RequestMapping(path="/log", method=RequestMethod.GET)

    public String home(){
            logger.info("This is info message");
            logger.warn("This is a warning message");
            logger.error("This is error msg");
            logger.debug("this is debug message");
            logger.trace("this is trace msg");
            //these are logged to the console when the website .../log is accessed


        return "Log in HomeController Called";

    }

    @RequestMapping(path="/home", method=RequestMethod.GET)
    public String homePage(){
        return "home";
    }



}
