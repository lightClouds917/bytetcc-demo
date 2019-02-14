package com.java4all.service.impl;

import com.java4all.dao.BankDao;
import com.java4all.service.BankService;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description:
 * tcc confirm逻辑
 * @author wangzhongxiang
 * @date 2019/2/13 17:08
 */
@Service("bankServiceConfirm")
public class BankServiceConfirm implements BankService{

  private Logger log = LoggerFactory.getLogger(BankServiceConfirm.class);

  @Autowired
  private BankDao bankDao;

  @Override
  @Transactional
  public int decreaseMoney(Integer id, BigDecimal money) {
    int line = bankDao.confirmDecreaseMoney(id, money);
    log.info("confirm decreaseMoney: id = "+id+",money ="+money);
    return line;
  }
}
