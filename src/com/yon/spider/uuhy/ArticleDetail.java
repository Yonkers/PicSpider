/*
 * File:Article.java
 * Date:2014-7-29下午5:02:44
 *
 * 四川长虹网络科技有限责任公司 (智能应用研发部)© 版权所有 
 */
package com.yon.spider.uuhy;

import java.util.List;


/**
 * @author yonkers
 */
public class ArticleDetail {
	
	private String describe;
	
	private List<UuhyPicture> pictures;

	/**
	 * @return the describe
	 */
	public String getDescribe() {
		return describe;
	}

	/**
	 * @param describe the describe to set
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	/**
	 * @return the pictures
	 */
	public List<UuhyPicture> getPictures() {
		return pictures;
	}

	/**
	 * @param pictures the pictures to set
	 */
	public void setPictures(List<UuhyPicture> pictures) {
		this.pictures = pictures;
	}

}
