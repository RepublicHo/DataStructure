package ReflectionTut;

/**
 * @Author Anthony Z.
 * @Date 27/6/2022
 * @Description:
 *
 * 通过 getUserName/setUserName来访问userName属性，这就是默认的规则。
 * Java JDK中提供了一套 API用来访问某个属性的 getter/setter 方法，这就是内省。
 *
 * 内省(Introspector)
 */
public class UserInfo {
    private long userId;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
