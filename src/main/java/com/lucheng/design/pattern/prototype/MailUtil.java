package com.lucheng.design.pattern.prototype;

import java.text.MessageFormat;

/**
 * 邮件工具类
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String content = "正在发送邮件 title{0}";
        String contentFormat = MessageFormat.format(content,mail.getTitle());
        mail.setContent(contentFormat);
        System.out.println(mail);
    }
    public static void saveMail(Mail mail){
        System.out.println(mail.toString());
    }
}
