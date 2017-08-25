package wugk.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import wugk.domain.TestTable;

import java.util.List;

/**
 * Created by WUGUOKAI on 2017/8/25.
 */
@Mapper
public interface TestTableMapper {
    @Select("select * from test_table")
    List<TestTable> testGetTableList();
}
