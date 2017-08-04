package wugk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WUGUOKAI on 2017/8/4.
 */
@RestController
@RequestMapping(value = "/")
public class TestController {
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String getTest(){
        return "Hello Wugk!";
    }
}
