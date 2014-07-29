/*
 * File:ArticleItem.java
 * Date:2014-7-29下午5:05:43
 *
 * 四川长虹网络科技有限责任公司 (智能应用研发部)© 版权所有 
 */
package com.yon.spider.uuhy;

/**
 * @author yonkers
 */
public class ArticleItem {
	private String title;
	private String iconUrl;
	private String info;
	private String detail_url;
	/**
	 * @return the iconUrl
	 */
	public String getIconUrl() {
		return iconUrl;
	}
	/**
	 * @param iconUrl the iconUrl to set
	 */
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	/**
	 * @return the detail_url
	 */
	public String getDetail_url() {
		return detail_url;
	}
	/**
	 * @param detail_url the detail_url to set
	 */
	public void setDetail_url(String detail_url) {
		this.detail_url = detail_url;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "ArticleItem [title=" + title + ", iconUrl=" + iconUrl
				+ ", info=" + info + ", detail_url=" + detail_url + "]";
	}
	
}
