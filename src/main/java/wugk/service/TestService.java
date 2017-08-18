package wugk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import wugk.domain.TestTable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by WUGUOKAI on 2017/8/18.
 */
@Service
public class TestService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<TestTable> getList(){
        String sql = "select * from test_table";
        return (List<TestTable>) jdbcTemplate.query(sql, new RowMapper<TestTable>(){

            @Override
            public TestTable mapRow(ResultSet rs, int rowNum) throws SQLException {
                TestTable tt = new TestTable();
                tt.setId(rs.getLong(1));
                tt.setTestName(rs.getString(2));
                tt.setTestDesc(rs.getString(3));
                return tt;
            }

        });
    }
}
