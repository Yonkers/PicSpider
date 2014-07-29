package com.yon.spider.pic.baidu;

import com.yon.spider.base.Picture;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by yonkers on 7/29/14.
 */
public class BaiduPicSpider {

    public void spide(String url){
        try {
            Document doc = Jsoup.connect(url).timeout(20000).get();
//            Elements els = doc.getElementsByAttributeValue("class","mod-img");

            Element element = doc.getElementById("plz-waterfall");
            Elements all = element.getAllElements();

            Elements elCols = element.getElementsByAttributeValue("class","mod-col");
            int cnt = elCols.size();
            Element imgElement;
            Picture picture;
            for(int i=0;i< cnt;i++){
                imgElement = elCols.get(i);
                picture = new Picture();
                picture.setUrl(imgElement.getElementsByTag("a").get(0).attr("href"));
                System.out.println(picture);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void getPictures(){

    }

    private void getCategory(){

    }
}
