package Container;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author Anthony Z.
 * @Date 13/5/2022
 * @Description:
 *
 * 集合与数存储数据概述：
 * 集合：
 * 数组一旦定义好，只能操作
 */
public class IteratorTest {


    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add("abc");
        // 集合什么都能往里放，有弊端
//        需要用泛型解决

        // .contains(Object obj): 判断当前集合中是否包含obj
        boolean ifContain = coll.contains(123);
        System.out.println(ifContain);
        System.out.println(coll.contains(1212121));



    }
}

class People{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public People(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return "Person{" +
                "Name=" + this.name + '\'' +
                ", Age=" + this.age +
                '}';

    }


    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        People people = (People) obj;
        return people.age == this.age;
    }
}