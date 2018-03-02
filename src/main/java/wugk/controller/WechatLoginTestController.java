package wugk.controller;

import org.hibernate.annotations.Parameter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wugk.domain.WechatAccessToken;
import wugk.domain.WechatUserInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by WUGUOKAI on 2018/2/5.
 */
@RestController
@RequestMapping(value = "/wechat")
public class WechatLoginTestController {

    @RequestMapping(value = "/qr", method = RequestMethod.GET)
    public String getCode(HttpServletRequest request, HttpServletResponse response, @RequestParam("appid") String appId,
                          @RequestParam("redirect_uri") String redirectUri, @RequestParam("response_type") String responseType,
                          @RequestParam("scope") String scope, @RequestParam("state") String state) throws IOException {
//        appid=appid&redirect_uri=http%3A%2F%2Fgateway.choerodon.com.cn%2Foauth%2Fwechat%2Flogin&response_type=code&scope=snsapi_login&state=vxdJ
        System.out.println(appId
                            + "/n"
                            + redirectUri
                            + "/n"
                            + responseType
                            + "/n"
                            + scope
                            + "/n"
                            + state);

        response.sendRedirect("http://localhost:8020/oauth/wechat/login?code=code666&state="+state);
        return "redirect:" + "http://localhost:8020/oauth/wechat/login?code=code666&"+state;
    }

    @RequestMapping(value = "/access_token", method = RequestMethod.GET)
    public WechatAccessToken getAccess(HttpServletRequest request, @RequestParam("appid") String appid,
                            @RequestParam("secret") String secret, @RequestParam("code") String code, @RequestParam("grant_type") String grantType){
        System.out.println(appid
                            +"/n"
                            +secret
                            +"/n"
                            +code
                            +"/n"
                            +grantType);
        WechatAccessToken wechatAccessToken = new WechatAccessToken();
        wechatAccessToken.setAccessToken("accesstoken-aaaa-bbb");
        wechatAccessToken.setRefreshToken("refresh-aaaa");
        wechatAccessToken.setOpenId("openIdbbb");
        wechatAccessToken.setExpiresIn(1800);
        return wechatAccessToken;
    }

    @RequestMapping(value = "/user_info", method = RequestMethod.GET)
    public WechatUserInfo getUserInfo(HttpServletRequest request, @RequestParam("access_token") String accessToken,
                                       @RequestParam("openid") String openId){
        System.out.println(accessToken
                +" /n  "
                +openId
                );
        WechatUserInfo wechatUserInfo = new WechatUserInfo();
        wechatUserInfo.setOpenId(openId);
        wechatUserInfo.setNickName("wuguokai");
        wechatUserInfo.setUnionId("unionIdbbbb");
        return wechatUserInfo;
    }
}
