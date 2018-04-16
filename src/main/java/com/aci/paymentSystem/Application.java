package com.aci.paymentSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Филипп on 14.04.2018.
 */

@Controller
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String showHelloWorld(){
        return "hello-world";
    }
}
