package com.java4all.controller;

import com.java4all.service.UserService;
import com.java4all.service.impl.UserServiceImpl;
import java.math.BigDecimal;
import org.bytesoft.compensable.Compensable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author wangzhongxiang
 * @date 2019/2/13 15:23
 */
@Compensable(
    interfaceClass = UserService.class,
    confirmableKey = "userServiceConfirm",
    cancellableKey = "userServiceCancel")
@RestController
@RequestMapping("user")
public class UserController {

  private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

  @Autowired
  private UserService userServiceImpl;

  @GetMapping("increaseMoney")
  @Transactional
  public void increaseMoney(Integer id,BigDecimal money){
    int line = userServiceImpl.increaseMoney(id, money);
    log.info("修改行数为："+line);
  }
}
