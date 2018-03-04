package com.example.hi.apptruyentranh.OBJECTS;

/**
 * Created by hi on 3/4/2018.
 */

public class ObjCategory {
    private String id;
    private String categoryName;
    private String categoryUrl;
    private int totalOfPage;
    private int cachingPage;
    private String categoryImageUrl;
    private String actionListChapter;

    public String getId() {
        return id;
    }

    public ObjCategory setId(String id) {
        this.id = id;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public ObjCategory setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public String getCategoryUrl() {
        return categoryUrl;
    }

    public ObjCategory setCategoryUrl(String categoryUrl) {
        this.categoryUrl = categoryUrl;
        return this;
    }

    public int getTotalOfPage() {
        return totalOfPage;
    }

    public ObjCategory setTotalOfPage(int totalOfPage) {
        this.totalOfPage = totalOfPage;
        return this;
    }

    public int getCachingPage() {
        return cachingPage;
    }

    public ObjCategory setCachingPage(int cachingPage) {
        this.cachingPage = cachingPage;
        return this;
    }

    public String getCategoryImageUrl() {
        return categoryImageUrl;
    }

    public ObjCategory setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
        return this;
    }

    public String getActionListChapter() {
        return actionListChapter;
    }

    public ObjCategory setActionListChapter(String actionListChapter) {
        this.actionListChapter = actionListChapter;
        return this;
    }
}
