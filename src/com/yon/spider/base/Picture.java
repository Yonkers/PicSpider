package com.yon.spider.base;

/**
 * Created by yonkers on 7/29/14.
 */
public class Picture {
    protected String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "url='" + url + '\'' +
                '}';
    }
}
