package com.notfound.crm.sys.util.easyexcel;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/7/17
 *   Time: 13:51
 */


import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

public class Md5Util {
    /***
     * 返回字符串的Md5加密后的字符串。
     * @param str 将要加密的字符串
     * @return 加密后的字符串
     */
    public static String getMd5String(String str) {
        //使用Spring框架自带的加密工具类DigestUtils进行Md5消化算法的加密
        return DigestUtils.md5DigestAsHex(str.getBytes(StandardCharsets.UTF_8));
    }
}
