package ReflectionTut;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author Anthony Z.
 * @Date 27/6/2022
 * @Description:
 *
 * Java在运行时街工不可变，和C#、python不同
 * 但是我们可以通过反射机制 字节码操作获得类似动态语言的特性
 *
 * Reflection is a program's ability to examine and change its behavior
 * and structure at runtime.
 *
 *
 * Reflection（反射）被视为动态语言的关键，反射机制允许程序在执行期间
 * 借助于Reflection API取得任何类的内部信息，并能直接操作任意对象的
 * 内部属性和方法
 *
 * 正常方式：引入需要的“包类”名称，通过new实例化，得到实例化对象
 * 反射方式：实例化对象，getClass()方法，得到完整的“包类”名称
 *
 *
 * 反射的功能
 * 1. 在运行时判断一个对象所属的类
 * 2. 在运行时构造一个对象
 * 3. 在运行时判断任何一个类所具有的成员变量和方法
 * 4. 在运行时获取泛型信息
 * 5. 在运行时。。。
 */
public class Test1 {

    // 反射之前，对于Person的操作
    public static void test1(){

        // 创建Person类的对象
        Person person = new Person();
        // 创建对象，调用其内部的属性和方法
        // 但是不可以调用私有结构
        person.age = 10;
        System.out.println(person.toString());

    }
//  反射之后，对于Person的操作
    public static void test2() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class clazz = Person.class;
        // 通过反射，创建Person类的对象
        Constructor cons = clazz.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person) obj;
        System.out.println(obj.toString());

        // 2. 通过反射，调用对象指定的属性，方法
        Field age = clazz.getDeclaredField("age");
        age.set(p, 10);
        System.out.println(p.toString());

        // 3. 調用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        // 通过反射，可以调用Person类的私有结构。比如：私有的构造器、方法、属性
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person) cons1.newInstance("Jerry");
        System.out.println(p1);

        // 调用私有的属性

    }
    public static void main(String[] args) {
        try {
            test2();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

    }

}
