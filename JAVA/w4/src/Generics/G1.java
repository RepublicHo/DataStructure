package Generics;

import java.util.ArrayList;

/**
 * @Author Anthony Z.
 * @Date 30/5/2022
 * @Description:
 *
 * 在实例化集合类时，可以指明具体的泛型类型
 * 泛型的类型必须是类，不能是基本数据类型，如果需要的花用包装类替换
 * 如果没有指明，默认为object类
 *
 *
 */
public class G1 {
    public void unsafe(){
        ArrayList l1 = new ArrayList();
        l1.add(23);
        l1.add(34);
        // 类型不安全 强转会出异常
         l1.add("sds");
    }
}
