package com.notfound.crm.common.base;

import java.util.List;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/11
 *   Time: 22:34
 */

public class CustomertraceVOOnly {

    private Long id;//客户id

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CustomertraceVOOnly{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info=" + info +
                '}';
    }
}
