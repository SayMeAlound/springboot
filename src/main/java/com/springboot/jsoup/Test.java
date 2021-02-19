package com.springboot.jsoup;/*

    @author  zjc
    @create 2021-02-19-22:49
     
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.StringUtils;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test {
    public static void main(String[] args) throws Exception {
        String url = "https://mp.weixin.qq.com/s/OK-unCHbPOJoO91YdCMd4Q";
        Document document = Jsoup.parse(new URL(url), 10000);
        Element content = document.getElementById("page-content");
        Elements imgs = content.getElementsByTag("img");
        int id = 0;
        for (Element img : imgs) {
            String src = img.attr("data-src");
            System.out.println(src);
            //获取输入流
            if (StringUtils.isEmpty(src)!=true){
                URL target = new URL(src);
                URLConnection connection = target.openConnection();
                InputStream inputStream = connection.getInputStream();
                id++;
                OutputStream outputStream = new FileOutputStream("B:\\images\\"+id+".png");
                int temp = 0;
                while ((temp =inputStream.read())!=-1){
                    outputStream.write(temp);
                }
                System.out.println(id + ".jpg下载完毕");
            }


        }
    }
}
