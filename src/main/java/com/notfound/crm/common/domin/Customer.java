package com.notfound.crm.common.domin;

import lombok.*;

import java.util.Date;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/9
 *   Time: 17:01
 */


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Long id;  //ID
    private String name; //客户姓名
    private int age; //客户年龄
    private int gender;//性别
    private String tel;//电话
    private String qq; //QQ号码
    private String job; //职业
    private String source;//客户来源
    private String seller;//负责人
    private String inputUser;//创建人
    private Date inputTime;//创建时间
    private int status;//客户状态：-2:流失，-1:开发失败，0:潜在客户，1:正式客户，2:资源池客户
    private Date positiveTime; //转正时间
}
