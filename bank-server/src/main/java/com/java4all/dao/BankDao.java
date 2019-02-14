package com.java4all.dao;

import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * description:
 *
 * @author wangzhongxiang
 * @date 2019/2/13 17:01
 */
@Repository
public interface BankDao {

  int decreaseMoney(@Param("id") Integer id,@Param("money") BigDecimal money);
  int confirmDecreaseMoney(@Param("id") Integer id,@Param("money") BigDecimal money);
  int cancelDecreaseMoney(@Param("id") Integer id,@Param("money") BigDecimal money);
}
