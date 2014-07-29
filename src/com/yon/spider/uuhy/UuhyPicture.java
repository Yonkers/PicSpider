/*
 * File:Picture.java
 * Date:2014-7-29下午5:01:21
 *
 * 四川长虹网络科技有限责任公司 (智能应用研发部)© 版权所有 
 */
package com.yon.spider.uuhy;

import com.yon.spider.base.Picture;

/**
 * @author yonkers
 */
public class UuhyPicture extends Picture{

	private int width;
	private int height;
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "UuhyPicture [url=" + url + ", width=" + width + ", height="
				+ height + "]";
	}

}
