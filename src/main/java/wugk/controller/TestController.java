package wugk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wugk.domain.TestTable;
import wugk.dao.JpaTestTableDao;
import wugk.mapper.TestTableMapper;
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
    @Autowired
    private TestTableMapper testTableMapper;

    @RequestMapping(value = "/getjpa",method = RequestMethod.GET)
    public String jpaGetTest() {
        /*System.out.println(testService.getList());
        return testService.getList();*/
       System.out.println(jpaTestTableDao.findAll().toString());
       return jpaTestTableDao.findAll().toString();
    }

    @RequestMapping(value = "/gethello",method = RequestMethod.GET)
    public String getTest2() {
        return "hello";
    }

    @RequestMapping(value = "/getmybatis", method = RequestMethod.GET)
    public List<TestTable> mybatisTest(){
        return testTableMapper.testGetTableList();
    }
}
