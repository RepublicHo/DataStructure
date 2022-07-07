package ReflectionTut;

/**
 * @Author Anthony Z.
 * @Date 27/6/2022
 * @Description:
 *
 * 单单问反射有什么用，其实最常用的就两个：
 * 1. 根据类名创建实例（类名可以从配置文件中读取，不用new，达到解耦）
 * 2. 用Method.invoke执行方法
 *
 * 余下中文内容去看note里oop下的中文文章
 *
 * Before learning reflection, we might assume that adapting code must
 * be accomplished by a person sitting at a keyboard instead of
 * by a program running on a computer.
 *
 * Reflection is the ability of a running program to examine itself
 * and its software environment, and to change what it does depending on what it finds.
 *
 * In an object-oriented world, a program needs to have a representation of itself, and
 * it is called metaobjects.
 *
 *
 */
public class HelloWorld {
    public void printName(){
        System.out.println(this.getClass().getName());

        (new HelloWorld()).printName();
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printName();
    }
}
