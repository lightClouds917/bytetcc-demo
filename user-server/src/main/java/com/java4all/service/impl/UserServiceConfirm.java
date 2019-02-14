package com.java4all.service.impl;

import com.java4all.dao.UserDao;
import com.java4all.service.UserService;
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
 * @date 2019/2/13 16:30
 */
@Service("userServiceConfirm")
public class UserServiceConfirm implements UserService{

  private Logger log = LoggerFactory.getLogger(UserServiceConfirm.class);

  @Autowired
  private UserDao userDao;

  @Override
  @Transactional
  public int increaseMoney(Integer id, BigDecimal money) {
    int line = userDao.confirmIncreaseMoney(id, money);
    log.info("confirm increaseMoney: id = "+id+",money ="+money);
    return line;
  }
}
