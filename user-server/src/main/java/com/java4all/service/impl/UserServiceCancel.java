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
 * tcc cancal逻辑
 * @author wangzhongxiang
 * @date 2019/2/13 16:33
 */
@Service("userServiceCancel")
public class UserServiceCancel implements UserService {

  private Logger log = LoggerFactory.getLogger(UserServiceCancel.class);

  @Autowired
  private UserDao userDao;

  @Override
  @Transactional
  public int increaseMoney(Integer id, BigDecimal money) {
    int line = userDao.cancelIncreaseMoney(id, money);
    log.info("cancel increaseMoney: id = "+id+",money ="+money);
    return line;
  }
}
