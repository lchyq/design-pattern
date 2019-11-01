package com.lucheng.design.pattern.prototype;

/**
 * 邮件对象
 */
public class Mail implements Cloneable {
    private String title;
    private String content;

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

    @Override
    public String toString() {
        return "Mail{" +
                "title='" + title + '\'' +
                ", content=" + content +
                '}' + super.toString();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
