package wugk.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * bundle.update.json配置文件对应的对象
 *
 * Created by WUGUOKAI on 2017/8/30.
 */

public class AppUpdatePojo {
    private Integer id;//app的id
    private String name;
    private String version;
    private Boolean updateAble;
    private String url;
    private String targetVersion;
    private BundleUpdatePojo mainBundleUpdate;
    private Map<String, BundleUpdatePojo> bundlesUpdate = new HashMap<String, BundleUpdatePojo>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getUpdateAble() {
        return updateAble;
    }

    public void setUpdateAble(Boolean updateAble) {
        this.updateAble = updateAble;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public BundleUpdatePojo getMainBundleUpdate() {
        return mainBundleUpdate;
    }

    public void setMainBundleUpdate(BundleUpdatePojo mainBundleUpdate) {
        this.mainBundleUpdate = mainBundleUpdate;
    }

    public Map<String, BundleUpdatePojo> getBundlesUpdate() {
        return bundlesUpdate;
    }

    public void setBundlesUpdate(Map<String, BundleUpdatePojo> bundlesUpdate) {
        this.bundlesUpdate = bundlesUpdate;
    }
}