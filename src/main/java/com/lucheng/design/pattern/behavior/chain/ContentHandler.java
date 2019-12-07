package com.lucheng.design.pattern.behavior.chain;

public class ContentHandler extends Handler {
    @Override
    public void handle(Article article) {
        System.out.println("ContentHandler 开始处理--");
        if(article.getContent() == null){
            System.out.println("手记内容为null ContentHandler 处理不通过");
        }else{
            System.out.println("ContentHandler 处理通过");
            if(handler != null){
                System.out.println("开始下一个流程");
                handler.handle(article);
            }else{
                System.out.println("流程审批完成");
            }
        }
    }
}
