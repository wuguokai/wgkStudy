package wugk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wugk.domain.TestTable;
import wugk.dao.JpaTestTableDao;
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
    @Autowired
    private JpaTestTableDao jpaTestTableDao;
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String jpaGetTest() {
        /*System.out.println(testService.getList());
        return testService.getList();*/
       System.out.println(jpaTestTableDao.findAll().toString());
       return jpaTestTableDao.findAll().toString();
    }
    @RequestMapping(value = "/get2",method = RequestMethod.GET)
    public String getTest2() {
        return "hello";
    }
}
