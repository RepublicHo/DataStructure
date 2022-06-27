package Generics;

import java.util.List;
import java.util.Map;

/**
 * @Author Anthony Z.
 * @Date 5/6/2022
 * @Description: generics 的应用场景
 * 数据库数据的写改删查
 *
 * DAO: database access object
 */
public class DAO<T> {

    private Map<String, T> map;


    public void add(String s, T t){
        map.put(s, t);
    }

    public boolean remove(int index){

        return false;
    }

    public void update(String s, T t){
        map.replace(s, t);

//        if(map.containsKey(s)){
//            map.put(s, t);
//        }

    }

    public T getIndex(String s){

        return map.get(s);
    }

    public List<T> getIndex(int[] index){
        return null;
    }
}

class Customer{

}
class CustomerDAO extends DAO<Customer>{

    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();
        dao1.add("abc", new Customer());

    }

    // Generics Method, return the number of record
    // or the time?
    public <E> E getValue(){
        return null;
    }
}