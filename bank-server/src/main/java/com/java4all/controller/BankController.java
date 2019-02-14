package com.java4all.controller;

import com.java4all.entity.Bank;
import com.java4all.feign.UserServiceApi;
import com.java4all.service.BankService;
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
 * @date 2019/2/13 17:16
 */
@RestController
@RequestMapping("bank")
@Compensable(
    interfaceClass = BankService.class,
    confirmableKey = "bankServiceConfirm",
    cancellableKey = "bankServiceCancel")
@SuppressWarnings("all")
public class BankController {

  private Logger log = LoggerFactory.getLogger(BankController.class);

  @Autowired
  private BankService bankServiceImpl;
  @Autowired
  private UserServiceApi userServiceApi;

  @GetMapping("decreaseMoney")
  @Transactional
  public void decreaseMoney(Integer id,BigDecimal money){
    //feign调用   调用user-server给用户加钱
    userServiceApi.increaseMoney(id,money);
    //本地服务 给银行减钱
    int line = bankServiceImpl.decreaseMoney(id, money);
    log.info("修改行数为："+line);
  }

}
