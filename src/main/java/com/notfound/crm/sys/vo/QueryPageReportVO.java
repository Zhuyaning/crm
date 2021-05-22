package com.notfound.crm.sys.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/13
 *   Time: 11:43
 */

public class QueryPageReportVO {

  private String name;

  private int  num;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date inputTime;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public Date getInputTime() {
    return inputTime;
  }

  public void setInputTime(Date inputTime) {
    this.inputTime = inputTime;
  }

  @Override
  public String toString() {
    return "QueryPageReportVO{" +
            "name='" + name + '\'' +
            ", num=" + num +
            ", inputTime=" + inputTime +
            '}';
  }
}
