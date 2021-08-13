package jian.he.springdemo.controllers;

import jian.he.springdemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    public GreetingService greetingService; //inject greeting service class.

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
