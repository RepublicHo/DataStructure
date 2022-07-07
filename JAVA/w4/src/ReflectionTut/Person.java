package ReflectionTut;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * @Author Anthony Z.
 * @Date 27/6/2022
 * @Description:
 */
public class Person {
    private String name;
    public int age;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}

class Test{
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        for(PropertyDescriptor pd:info.getPropertyDescriptors()){
            System.out.println(pd.getName());
            System.out.println(" " + pd.getReadMethod());
            System.out.println(" " + pd.getWriteMethod());
        }
    }
}