package com.java4all.service;

import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

/**
 * description:
 *
 * @author wangzhongxiang
 * @date 2019/2/13 15:24
 */
public interface UserService {

  int increaseMoney(Integer id,BigDecimal money);

}
