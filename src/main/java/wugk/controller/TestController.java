package wugk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wugk.domain.*;
import wugk.dao.JpaTestTableDao;
import wugk.mapper.TestTableMapper;
import wugk.service.TestService;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
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

    @RequestMapping(value = "/testPost",method = RequestMethod.POST)
    public void testPost(@RequestBody Icons iconModels) {
        System.out.println(iconModels);
    }

    //文件下载
    @RequestMapping(value = "/downloadFile",method = RequestMethod.GET)
    public void downloadFile(HttpServletResponse res) {
        String filePath = "C:\\Users\\WUGUOKAI\\Desktop\\Appmain.android-1.0.0.zip";
//        res.setHeader("Content-Disposition", "attachment;filename=" + bundleVersion.getFileName());
        byte[] buff = new byte[1024];
        BufferedInputStream bis = null;
        OutputStream os = null;
        try {
            File file = new File(filePath);
            System.out.println(file.length());
            res.setContentType("application/zip");
            os = res.getOutputStream();
            bis = new BufferedInputStream(new FileInputStream(file));
            res.setHeader("transfer-encoding", "");
            res.setContentLength(bis.available());
            res.setHeader("Content-Size", String.valueOf(bis.available()));
//            res.setHeader("Content-Length", String.valueOf(bis.available()));
            int readLength = 0; // read()当到达文件末尾返回-1，实现连续读取写入 while
            while ((readLength = bis.read(buff)) != -1) {
                os.write(Arrays.copyOf(buff, readLength));
            }
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @RequestMapping(value = "/testLink",method = RequestMethod.POST)
    public AppUpdatePojo testLink(@RequestBody AppPojo appPojo) {
        System.out.println(appPojo);
        AppUpdatePojo appUpdatePojo = new AppUpdatePojo();
        return appUpdatePojo;
    }

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
