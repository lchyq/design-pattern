package com.lucheng.design.pattern.behavior.chain;

public class TitleHandler extends Handler {
    @Override
    public void handle(Article article) {
        System.out.println("TitleHandler 开始处理--");
        if(article.getTitle() == null){
            System.out.println("手记名称为null TitleHandler 处理不通过");
        }else{
            System.out.println("TitleHandler 处理通过");
            if(handler != null){
                System.out.println("开始下一个流程");
                handler.handle(article);
            }else{
                System.out.println("流程审批完成");
            }
        }
    }
}
