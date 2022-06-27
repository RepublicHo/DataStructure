package NestedClass;

/**
 * @Author Anthony Z.
 * @Date 23/6/2022
 * @Description:
 *
 * Static block:
 * 1. It is used to initialize the static data member.
 * 2. (Important) It's executed before the main method
 * at the time of classloading.
 *
 * Since JDK 1.7, it's not possible to execute a Java class without the main method.
 */
public class MoreStatic2 {
    static {
        System.out.println("Static here");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        MoreStatic2 moreStatic2 = new MoreStatic2();

    }

}
