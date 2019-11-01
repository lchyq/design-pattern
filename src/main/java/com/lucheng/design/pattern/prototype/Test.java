package com.lucheng.design.pattern.prototype;

/**
 * 浅拷贝
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("原始mail");
        long start = System.currentTimeMillis();
        for(int i = 0;i < 1000;i++){
            //循环中是一个频繁创建对象的过程
            //1.通过new对象来解决，但是假设new的代价很高
//            Mail mail1 = new Mail();
//            mail1.setTitle("title_"+i);
            //2.若构造对象十分复杂则需要通过clone的方式来创建新对象,mail类实现clone方法，重写clone();
            //此实现为浅克隆，若克隆对象的属性为对象的话，我们需要深拷贝
            Mail mail1 = (Mail) mail.clone();
            mail1.setTitle("title_"+i);
            MailUtil.sendMail(mail1);
        }
        long end  = System.currentTimeMillis();
        System.out.println("end:"+(end - start));
        //若12行位置不能变动，但是mail必须是原始的mail，该如何解决
        MailUtil.saveMail(mail);
    }
}
