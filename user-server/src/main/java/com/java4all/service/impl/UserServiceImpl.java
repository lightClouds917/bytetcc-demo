package com.java4all.service.impl;

import com.java4all.dao.UserDao;
import com.java4all.service.UserService;
import java.math.BigDecimal;
import org.bytesoft.compensable.Compensable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description:
 * tcc try逻辑
 * @author wangzhongxiang
 * @date 2019/2/13 15:25
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

  private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

  @Autowired
  private UserDao userDao;

  @Override
  @Transactional
  public int increaseMoney(Integer id, BigDecimal money) {
    int line = userDao.increaseMoney(id, money);
    log.info("try increaseMoney: id = "+id+",money ="+money);
    return line;
  }
}
