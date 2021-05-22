package com.notfound.crm.sys.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/13
 *   Time: 11:43
 */

public class QueryPageReportVO {

  private String groupType;

  private int  num;

  public String getGroupType() {
    return groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  @Override
  public String toString() {
    return "QueryPageReportVO{" +
            "groupType='" + groupType + '\'' +
            ", num=" + num +
            '}';
  }
}
