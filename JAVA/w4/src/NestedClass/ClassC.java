package NestedClass;

/**
 * @Author Anthony Z.
 * @Date 23/6/2022
 * @Description:
 *
 * 1. Nested static class doesn't need a reference of outer class
 * but a nonstatic nested class or inner class requires Outer class reference.
 *
 * 2. A non-static nested class has full access to the members of the class
 * within which it is nested. 这也是非静态内部类一个很大的有点，可以自由地
 * 访问外部类的所有变量和方法
 */
public class ClassC {

    private static int a = 2;
    private int b = 3;

    class ClassD{
        void get(){
            System.out.println(a);
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        ClassC classC = new ClassC();

//      下面这个很容易记错
        ClassC.ClassD classD = classC.new ClassD();
        classD.get();

    }
}
