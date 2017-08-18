package wugk.domain;

/**
 * Created by WUGUOKAI on 2017/8/4.
 */

public class TestTable {
    private Long id;
    private String testName;
    private String testDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestDesc() {
        return testDesc;
    }

    public void setTestDesc(String testDesc) {
        this.testDesc = testDesc;
    }

    @Override
    public String toString() {
        return "TestTable{" +
                "id=" + id +
                ", testName='" + testName + '\'' +
                ", testDesc='" + testDesc + '\'' +
                '}';
    }
}
