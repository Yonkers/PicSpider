/*
 * File:Test.java
 * Date:2014-7-29下午3:40:29
 *
 * 四川长虹网络科技有限责任公司 (智能应用研发部)© 版权所有 
 */
package com.yon.spider.test;

import com.yon.spider.uuhy.UuhySpider;

/**
 * @author yonkers
 */
public class UuhyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UuhySpider spider = new UuhySpider();
		String url = "http://image.baidu.com/channel?c=%E7%BE%8E%E5%A5%B3#%E7%BE%8E%E5%A5%B3";
		url = "http://uuhy.com/html/26315.html";
//		spider.spide(url);
		url = "http://uuhy.com/html/category/creativehome";
		spider.parseArticles(url);
	}

}
