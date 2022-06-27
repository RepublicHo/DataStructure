package NestedClass;

/**
 * @Author Anthony Z.
 * @Date 23/6/2022
 * @Description:
 *
 * Nested classes that are declared static are called static nested classes.
 * Non-static nested classes are called inner classes.
 *
 *
 * 1. The static inner class can access static members of the outer class directly.
 *
 * 2. to access the instance members of the outer class, however, we need to
 * instantiate the outer class.
 *
 * 3. A static nested class cannot invoke non-static methods or
 * access non-static fields of the class within which it is nested.
 *
 * 如果内部类和外部类的关系不紧密，不需要访问外部类的所有属性和方法。
 * 而且，由于内部类和外部类并没有相互之间的应用，因此还会省内存资源
 *
 * 如果你在这个类里面需要外面类的引用，就不要用static。反之就尽量用static，这样可以提高性能
 */
public class ClassA {
    private static int a = 2;
    private int b = 3;
    int count = 0;

    ClassA(){
        count++;
        System.out.println(count);
    }
    static class ClassB{
        void get(){
            System.out.println(a);
//            System.out.println(b);

        }
    }

    public void set(){

    }

    public static void main(String[] args) {
        ClassA.ClassB classB = new ClassB();
        classB.get();

        // 将count换成static试一试
        ClassA c1 = new ClassA();
        ClassA c2 = new ClassA();
        ClassA c3 = new ClassA();
        /**
         * For static one, it will get memory each time
         * when the instance is created.
         *
         * For non-static one, it will get memory only once and
         * retain its value.
         */


    }
}
