package wugk.domain;

/**
 * update的bundle信息
 *
 * Created by WUGUOKAI on 2017/8/30.
 */

public class BundleUpdatePojo {
    private Integer bundleId;//每个模块的id
    private String name;
    private String targetVersion;
    private Integer bundleVersionId;

    public Integer getBundleId() {
        return bundleId;
    }

    public void setBundleId(Integer bundleId) {
        this.bundleId = bundleId;
    }

    public Integer getBundleVersionId() {
        return bundleVersionId;
    }

    public void setBundleVersionId(Integer bundleVersionId) {
        this.bundleVersionId = bundleVersionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    @Override
    public String toString() {
        return "BundleUpdatePojo{" +
                "bundleId=" + bundleId +
                ", name='" + name + '\'' +
                ", targetVersion='" + targetVersion + '\'' +
                ", bundleVersionId='" + bundleVersionId + '\'' +
                '}';
    }
}
