package com.yon.spider.test;

import com.yon.spider.pic.baidu.BaiduPicSpider;
import com.yon.spider.uuhy.UuhySpider;

/**
 * Created by yonkers on 7/29/14.
 */
public class Test {

    public static void main(String[] args){
        baiduTest();

//        uuhyTest();
    }

    public static void baiduTest(){
        BaiduPicSpider spider = new BaiduPicSpider();
        String url = "http://image.baidu.com/channel?c=%E7%BE%8E%E5%A5%B3&t=%E5%85%A8%E9%83%A8&s=0";
        spider.spide(url);
    }

    public static void uuhyTest(){
        UuhySpider spider = new UuhySpider();
        String url = "http://image.baidu.com/channel?c=%E7%BE%8E%E5%A5%B3#%E7%BE%8E%E5%A5%B3";
        url = "http://uuhy.com/html/26315.html";
//		spider.spide(url);
        url = "http://uuhy.com/html/category/creativehome";
        spider.parseArticles(url);
    }
}
