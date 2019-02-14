package com.java4all.entity;

import java.math.BigDecimal;

/**
 * description:
 *
 * @author wangzhongxiang
 * @date 2019/2/13 17:01
 */
public class Bank {
  private int id;

  private BigDecimal money;

  private BigDecimal frozen;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public BigDecimal getMoney() {
    return money;
  }

  public void setMoney(BigDecimal money) {
    this.money = money;
  }

  public BigDecimal getFrozen() {
    return frozen;
  }

  public void setFrozen(BigDecimal frozen) {
    this.frozen = frozen;
  }
}
