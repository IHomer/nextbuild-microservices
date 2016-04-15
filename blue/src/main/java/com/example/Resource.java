package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xander on 15/04/16.
 */
@RestController
public class Resource {

    @Autowired
    private GreenClient greenClient;

    @RequestMapping(method = RequestMethod.GET, value = "/nextbuild")
    public String hello() {
        return "Hello Nextbuild, from BLUE!";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/nextbuildGreen")
    public String green() {
        return greenClient.nextbuild();
    }
}
