package com.notfound.crm.common.base;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/17
 *   Time: 10:40
 */

public class CustomertraceVOOnly2 extends CustomertraceVOOnly {
    private String seller;

    @Override
    public String getSeller() {
        return seller;
    }

    @Override
    public void setSeller(String seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "CustomertraceVOOnly2{" +
                "seller='" + seller + '\'' +
                '}';
    }
}
