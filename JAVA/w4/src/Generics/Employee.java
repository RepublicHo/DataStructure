package Generics;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author Anthony Z.
 * @Date 1/6/2022
 * @Description:
 *
 *
 */
public class Employee implements Comparable{

    private String name;
    private int age;

    public Employee(String name ,int age){
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Object o) {

        if(o instanceof Employee){
            Employee employee = (Employee)o;
            return this.name.compareTo(employee.name);
        }

        throw new RuntimeException("Data types");
    }

    public int compareTo(Employee e2){
        if(this.age<e2.getAge()){
            return -1;
        }else{
            return 1;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class testCAST1{

    public static void main(String[] args) {
//      Sort by age
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            // Type Cast/Type conversion may lead to some problem
//            we should try to avoid it
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

                    int a1 = e1.getAge();
                    int a2 = e2.getAge();

                    if(a1<a2){
                        return -1;
                    }else{
                        return 1;
                    }
                }
                throw new RuntimeException("Data type error");

            }
        });
        set.add(new Employee("Li Ming", 22));
        set.add(new Employee("Zhang Hua", 23));
        set.add(new Employee("Yi Xin", 20));


        Iterator<Employee> iterator = set.iterator();

        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println("Name: " + employee.getName() +
                    "\tAge: " + employee.getAge());
        }

    }
}

class testGeneric1{
    public static void main(String[] args) {
        TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
//                if(o1.getAge()<o2.getAge()){
//                    return -1;
//
//                }else{
//                    return 1;
//                }
                return o1.compareTo(o2);
            }
        });

        set.add(new Employee("Li Ming", 22));
        set.add(new Employee("Zhang Hua", 23));
        set.add(new Employee("Yi Xin", 20));


        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println("Name: " + employee.getName() +
                    "\tAge: " + employee.getAge());
        }
    }
}