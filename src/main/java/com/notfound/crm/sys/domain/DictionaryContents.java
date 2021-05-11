package com.notfound.crm.sys.domain;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/10 20:08
 * @Version 1.0
 * @Description 字典目录实体类
 */
public class DictionaryContents {
    private Integer id;     //id

    private String sn;      //字典目录编号

    private String title;   //字典目录名称

    private String intro;   //字典目录简介

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "DictionaryContents{" +
                "id=" + id +
                ", sn='" + sn + '\'' +
                ", title='" + title + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
