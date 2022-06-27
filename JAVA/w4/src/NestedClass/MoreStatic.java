package NestedClass;

/**
 * @Author Anthony Z.
 * @Date 23/6/2022
 * @Description:
 * The static can be 1. variable. 2. method 3. block 4. nested class
 * 静态变量，静态方法，静态块，内部静态类
 *
 * Pros of static variable
 * 1. It saves memory
 *
 * 通常，静态变量用final关键词来修饰，表示通用资源可以被说偶得对象所使用。
 * 如果静态变量未被私有化，可以用类名.变量名来使用


Methods.
 * 1. A static method belongs to the class rather than the object of the class.
 * 2. A static method can be invoked without the need for creating an
 * instance of a class.
 * 3. Importantly, a static method can access static data member
 * and can change the value of it.
 *
 * Attention:
 * 1. The static method cannot use static data member or
 * call non-static method directly.
 * 2. this and super cannot be used in static context.
 */
public class MoreStatic {
    static int num = 0;

    /**
     * Static method to change the value of static variable.
     */
    static void change(){

        num++;
    }

    /**
     * Method to display values.
     */
    void display(){
        System.out.println(num);
    }

    public static void main(String[] args) {
        MoreStatic.change();
        MoreStatic.change();
        MoreStatic moreStatic = new MoreStatic();
        moreStatic.display();

    }
}
