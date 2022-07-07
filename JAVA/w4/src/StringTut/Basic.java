package StringTut;

/**
 * @Author Anthony Z.
 * @Date 29/6/2022
 * @Description:
 *
 *
 */
public class Basic {
    static void test(){
        String s1 = "abc";
        String s2 = "abc";
//        s1 = "bbb";
        System.out.println(s1 == s2);
        // 说明在内存中指向的是同一个
        
    }

    public static void main(String[] args) {
        test();
    }
}
