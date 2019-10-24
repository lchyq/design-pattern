package com.lucheng.design.pattern.creational.simplefactory;

public class VideoFactory {
    /**
     * 若此时type有新需求
     * 那么需要修改简单工厂的创建逻辑
     * 不符合开闭原则-对扩展开放，对修改关闭
     * @param type
     * @return
     */
//    public Video produce(String type){
//        if("java".equalsIgnoreCase(type)){
//            return new JavaVedio();
//        }else if("python".equalsIgnoreCase(type)){
//            return new PythonVedio();
//        }
//        return null;
//    }

    //利用反射来解决该问题
    public Video produce(Class clazz){
        if (clazz == null){
            return null;
        }
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
