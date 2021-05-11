package com.notfound.crm.common.base;

import java.util.List;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/11
 *   Time: 22:34
 */

public class CustomertraceForm {

    private String name;//客户名字

    private List info;//装跟踪方式List

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getInfo() {
        return info;
    }

    public void setInfo(List info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "CustomertraceForm{" +
                "name='" + name + '\'' +
                ", info=" + info +
                '}';
    }
}
