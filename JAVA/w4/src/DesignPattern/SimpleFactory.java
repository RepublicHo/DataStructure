package DesignPattern;

import java.util.Calendar;

/**
 * @Author Anthony Z.
 * @Date 26/6/2022
 * @Description: 简单工厂模式 Simple Factory Pattern
 * 由一个工厂对象决定创建出哪一种产品
 *
 * 工厂类负责创建的对象较少
 * 客户端只需要传入工厂类的参数，
 * 对于如何创建对象的逻辑不需要关心
 *
 * 只需要传入一个正确的参数，就可以获取需要的对象
 * 而无序知道其创建的细节
 *
 * 缺点
 * 工厂类的职责相对过重，当增加新的产品时候，
 * 需要修改工厂类的判断逻辑，违反开闭原则
 *
 * 不易于扩展相对复杂的产品结构
 */
public class SimpleFactory {
    public Course create(String name){
//        if("java".equals(name)){
//            return new JavaCourse();
//        }else{
//            return null;
//        }
        // 利用Java反射会更简单
        try{
            if(!(name == null || "".equals(name))){
                return (Course) Class.forName(name).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Course create2(Class clazz) throws Exception {
        try{
            if(null != clazz){
                return (Course) clazz.newInstance();
            }
        }catch (Exception e){
            throw new Exception();
        }
        return null;
    }
}

interface Course{
    void record();
}

class JavaCourse implements Course{
    @Override
    public void record() {

    }

    public static void main(String[] args) {
        // 思考为什么这个method不是static
        Course course = new SimpleFactory().create("Java");
        course.record();


    }
}