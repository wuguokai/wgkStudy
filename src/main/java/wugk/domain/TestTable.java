package wugk.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by WUGUOKAI on 2017/8/4.
 */
@Entity
@Table(name = "test_table")
public class TestTable {
    @Id
    @GeneratedValue
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
