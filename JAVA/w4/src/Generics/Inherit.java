package Generics;

import java.util.*;

/**
 * @Author Anthony Z.
 * @Date 8/6/2022
 * @Description:
 *
 * 泛型之中的通配符(Wildcards)使用限制泛型可用类型在定义泛型类别时，
 * 预设可以使用任何的类型来实例化泛型类型中的类型
 */
public class Inherit {

    public void print(){
        List<Object> list1 = null;
        List<String> list2 = null;
        list2.add("aaa");

        // 通配符: 我们不能向其内部添加数据
        List<?> list = null;
        list = list1;
        list = list2;
        list.add(null);

//        list.add("dd");
        Object o = list.get(0);
        System.out.println(o);
    }

    public void test1(){

        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = null;
//        list1 = list2; 这种写法是错的
//        List<Object> 和 List<String> 不具备子父类关系

    }

    /**
     * 有限制条件的通配符的使用
     * ? extends Person
     * ? super Person
     */
    public void test3(){
        // ? 可以是testCAST1或它的子类 就list=而言

        List<? extends testCAST1> list1 = null;
        // ? 大于等于
        List<? super testCAST1> list2 = null;


    }

    public static void main(String[] args) {
        Inherit inherit = new Inherit();
        inherit.print();

//      遍历key
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 23);
        Set<String> keySet = map.keySet();
        for(String key:keySet){
            System.out.println(key);
        }
//      遍历value
        Collection<Integer> values = map.values();
        Iterator<Integer> iterator = values.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


//      遍历key-value
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            Map.Entry<String, Integer> entry = iterator1.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }
}
