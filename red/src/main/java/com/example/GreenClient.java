package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xander on 15/04/16.
 */
@FeignClient("green")
public interface GreenClient {
    @RequestMapping(method = RequestMethod.GET, value = "/nextbuild")
    String nextbuild();
}
