package com.lucheng.design.pattern.behavior.memoto;

/**
 * 手记类
 */
public class Article {
    private String title;
    private String content;
    private String imgs;
    private ArticleMemotoManager articleMemotoManager = new ArticleMemotoManager();

    public Article(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    //存储快照
    public ArticleMemoto saveArticleMemoto(){
        ArticleMemoto articleMemoto = new ArticleMemoto(this.title,this.content,this.imgs);
        articleMemotoManager.saveArticleMemoto(articleMemoto);
        return articleMemoto;
    }

    //回退到上一个快照版本
    public void undoArticleMemoto(){
        ArticleMemoto articleMemoto = articleMemotoManager.popArticleMemoto();
        this.title = articleMemoto.getTitle();
        this.content = articleMemoto.getContent();
        this.imgs = articleMemoto.getImgs();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
