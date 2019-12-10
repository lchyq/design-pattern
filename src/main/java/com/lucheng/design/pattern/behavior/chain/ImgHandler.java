package com.lucheng.design.pattern.behavior.chain;

public class ImgHandler extends Handler {
    @Override
    public void handle(Article article) {
        System.out.println("ImgHandler 开始处理--");
        if(article.getImgs() == null){
            System.out.println("手记图片为null ImgHandler 处理不通过");
        }else{
            System.out.println("ImgHandler 处理通过");
            if(handler != null){
                System.out.println("开始下一个流程");
                handler.handle(article);
            }else{
                System.out.println("流程审批完成");
            }
        }
    }
}
