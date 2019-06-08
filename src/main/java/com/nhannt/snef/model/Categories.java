package com.nhannt.snef.model;

import java.io.Serializable;

public class Categories implements Serializable {

    private int categoriesid;
    private String categoriesname;

    public Categories() {
    }

    public Categories(int categoriesid, String categoriesname) {
        this.categoriesid = categoriesid;
        this.categoriesname = categoriesname;
    }

    public int getCategoriesid() {
        return categoriesid;
    }

    public void setCategoriesid(int categoriesid) {
        this.categoriesid = categoriesid;
    }

    public String getCategoriesname() {
        return categoriesname;
    }

    public void setCategoriesname(String categoriesname) {
        this.categoriesname = categoriesname;
    }
}
