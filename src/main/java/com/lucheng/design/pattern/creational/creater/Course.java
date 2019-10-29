package com.lucheng.design.pattern.creational.creater;

/**
 * 建造者模式
 * 适用于固定的组装模式
 * 但是可以生成出不同的对象
 * 对象的创建与使用是分离的
 */
public class Course {
    private String courseName;
    private String video;
    private String article;
    private String price;

    public Course(CourseBuilder courseBuilder){
        this.courseName = courseBuilder.courseName;
        this.video = courseBuilder.video;
        this.article = courseBuilder.article;
        this.price = courseBuilder.price;
    }

    //将建造者与产品绑定在一起
    public static class CourseBuilder{
        private String courseName;
        private String video;
        private String article;
        private String price;

        public CourseBuilder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }
        public CourseBuilder buildvideo(String video){
            this.video = video;
            return this;
        }
        public CourseBuilder buildarticle(String article){
            this.article = article;
            return this;
        }
        public CourseBuilder buildprice(String price){
            this.price = price;
            return this;
        }
        public Course build(){
            return new Course(this);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", video='" + video + '\'' +
                ", article='" + article + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
