package com.lucheng.design.pattern.behavior.chain;

/**
 * 责任链模式
 * 此处的Test 可以抽象为 处理handler的操作者
 */
public class Test {
    public static void main(String[] args) {
        Article article = new Article();
        article.setTitle("java设计模式");
        article.setContent("java设计模式-content");
        article.setImgs("java设计模式-img");

        Handler titleHandler = new TitleHandler();
        Handler ConHandler = new ContentHandler();
        Handler imgHandler = new ImgHandler();

        //设置责任链
        titleHandler.setNextHandler(ConHandler);
        ConHandler.setNextHandler(imgHandler);

        titleHandler.handle(article);
    }
}
