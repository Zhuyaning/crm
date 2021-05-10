package com.notfound.crm.sys.domain;

public class DictionaryDetails {
    private Integer id;         //id

    private String parent;      //字典目录（多对一）

    private String title;       //字典明细名称

    private Integer sequence;   //字典明细序号

    private DictionaryContents dictionaryContents; //字典目录

    public DictionaryContents getDictionaryContents() {
        return dictionaryContents;
    }

    public void setDictionaryContents(DictionaryContents dictionaryContents) {
        this.dictionaryContents = dictionaryContents;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "DictionaryDetails{" +
                "id=" + id +
                ", parent='" + parent + '\'' +
                ", title='" + title + '\'' +
                ", sequence=" + sequence +
                ", dictionaryContents=" + dictionaryContents +
                '}';
    }
}
