package wugk.dao;

import org.springframework.data.repository.CrudRepository;
import wugk.domain.TestTable;

/**
 * Created by WUGUOKAI on 2017/8/18.
 */
public interface JpaTestTableDao extends CrudRepository<TestTable, Long>{
}
