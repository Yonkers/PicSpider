/*
 * File:BaiduPicSpider.java
 * Date:2014-7-29下午3:36:15
 *
 * 四川长虹网络科技有限责任公司 (智能应用研发部)© 版权所有 
 */
package com.yon.spider.uuhy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;


/**
 * @author yonkers
 */
public class UuhySpider {
	public void spide(String url) {
		try {
			Document doc = Jsoup.connect(url).timeout(20000).get();
//			Elements els = doc.getElementsByAttributeValue("class", "mod-img");
			Elements sections = doc.getElementsByAttributeValue("class", "content");
			int size = sections.size();
			Elements img;
			if(size == 0) return;
			Element el = sections.get(0);
			img = el.getElementsByTag("img");
			int imgCount = img.size();
			if(imgCount == 0) return;
			ArticleDetail detail = new ArticleDetail();
			List<Picture> pics = new ArrayList<Picture>();
			Node elImg;
			Picture pic ;
			for(int i=0;i< imgCount;i++){
				elImg = img.get(i);
				if(!elImg.hasAttr("width") || !elImg.hasAttr("height")) continue;
				pic = new Picture();
				pic.setUrl(elImg.attr("src"));
				pic.setWidth(Integer.parseInt(elImg.attr("width")));
				pic.setHeight(Integer.parseInt(elImg.attr("height")));
				pics.add(pic);
				System.out.println(pic);
			}
			detail.setPictures(pics);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void parseArticles(String url){
		try {
			Document doc = Jsoup.connect(url).timeout(20000).get();
			Elements articles = doc.getElementsByTag("article");
			int size = articles.size();
			Element article ;
			ArticleItem articleItem;
			for(int i=0;i< size;i++){
				articleItem = new ArticleItem();
				article = articles.get(i);
				Element img = article.getElementsByAttributeValue("class", "custom_image").get(0);
				articleItem.setIconUrl(img.getElementsByTag("img").get(0).attr("src"));
				articleItem.setTitle(img.getElementsByTag("a").get(0).attr("title"));
				articleItem.setDetail_url(img.getElementsByTag("a").get(0).attr("href"));
				Element con = article.getElementsByAttributeValue("class", "content").get(0);
				articleItem.setInfo(con.text());
				System.out.println(articleItem);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
