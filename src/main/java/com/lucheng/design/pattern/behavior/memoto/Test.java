package com.lucheng.design.pattern.behavior.memoto;

/**
 * 备忘录模式
 * 用于存储某个对象的状态，以便在需要的时候恢复其状态
 */
public class Test {
    public static void main(String[] args) {
        //开始写手记
        Article article = new Article("创作手记A","创作手记A的内容","创作手记A的图片");
        System.out.println(String.format("开始写手记，内容为：%S",article.toString()));

        //暂存手记
        article.saveArticleMemoto();

        //修改手记
        article.setContent("修改后的创作手记A的内容");
        System.out.println(String.format("修改后的手记内容为：%S",article.toString()));

        //恢复上个版本的手记内容
        article.undoArticleMemoto();
        System.out.println(String.format("恢复后的手记内容为：%S",article.toString()));

    }
}
