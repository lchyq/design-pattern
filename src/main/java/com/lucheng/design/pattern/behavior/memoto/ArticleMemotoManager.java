package com.lucheng.design.pattern.behavior.memoto;

import java.util.Stack;

/**
 * 快照管理类
 */
public class ArticleMemotoManager {
    private final Stack<ArticleMemoto> Article_Memoto_Memory = new Stack<>();

    public void saveArticleMemoto(ArticleMemoto articleMemoto){
        Article_Memoto_Memory.push(articleMemoto);
    }
    public ArticleMemoto popArticleMemoto(){
        return Article_Memoto_Memory.pop();
    }
}
