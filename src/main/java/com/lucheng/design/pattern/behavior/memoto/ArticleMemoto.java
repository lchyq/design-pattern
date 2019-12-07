package com.lucheng.design.pattern.behavior.memoto;

/**
 * 手记快照类
 */
public class ArticleMemoto {
    private String title;
    private String content;
    private String imgs;

    public ArticleMemoto(String title,String content,String imgs){
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgs() {
        return imgs;
    }
}
