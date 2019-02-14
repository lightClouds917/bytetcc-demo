package com.java4all.service;

import java.math.BigDecimal;

/**
 * description:
 *
 * @author wangzhongxiang
 * @date 2019/2/13 17:03
 */
public interface BankService {

  int decreaseMoney(Integer id,BigDecimal money);
}
