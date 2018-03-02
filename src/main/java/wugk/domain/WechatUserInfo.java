package wugk.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by WUGUOKAI on 2018/1/29.
 */

public class WechatUserInfo {

//    "openid":"OPENID",
//            "nickname":"NICKNAME",
//            "sex":1,
//            "province":"PROVINCE",
//            "city":"CITY",
//            "country":"COUNTRY",
//            "headimgurl": "http://wx.qlogo.cn/mmopen/g3MonUZtNHkdmzicIlibx6iaFqAc56vxLSUfpb6n5WKSYVY0ChQKkiaJSgQ1dZuTOgvLLrhJbERQQ4eMsv84eavHiaiceqxibJxCfHe/0",
//            "privilege":[
//            "PRIVILEGE1",
//            "PRIVILEGE2"
//            ],
//            "unionid": " o6_bmasdasdsad6_2sgVt7hMZOPfL"

    @JsonProperty("openid")
    private String openId;
    @JsonProperty("nickname")
    private String nickName;
    @JsonProperty("sex")
    private Integer sex;
    @JsonProperty("province")
    private String province;
    @JsonProperty("city")
    private String city;
    @JsonProperty("country")
    private String country;
    @JsonProperty("headimgurl")
    private String headimgUrl;
    @JsonProperty("privilege")
    private String privilege;
    @JsonProperty("unionid")
    private String unionId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadimgUrl() {
        return headimgUrl;
    }

    public void setHeadimgUrl(String headimgUrl) {
        this.headimgUrl = headimgUrl;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    @Override
    public String toString() {
        return "WechatUserInfo{" +
                "openId='" + openId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sex=" + sex +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", headimgUrl='" + headimgUrl + '\'' +
                ", privilege='" + privilege + '\'' +
                ", unionId='" + unionId + '\'' +
                '}';
    }
}
