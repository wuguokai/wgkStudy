package wugk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wugk.domain.TestTable;
import wugk.service.TestService;

import java.util.List;

/**
 * Created by WUGUOKAI on 2017/8/4.
 */
@RestController
@RequestMapping(value = "/")
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public List<TestTable> getTest() {
        System.out.println(testService.getList());
        return testService.getList();
    }
    @RequestMapping(value = "/get2",method = RequestMethod.GET)
    public String getTest2() {
        return "hello";
    }
}
