package ReflectionTut;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @Author Anthony Z.
 * @Date 27/6/2022
 * @Description:
 * JavaBean主要用来传递数据，即把一组数据组合成一个JavaBean便于传输。
 *
 */
public class BeanInfoUtil {
    public static void setPropertyByIntrospector(UserInfo userInfo, String userName) throws Exception{
        BeanInfo beanInfo = Introspector.getBeanInfo(UserInfo.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        if(propertyDescriptors != null && propertyDescriptors.length>0){
            for(PropertyDescriptor propDesc:propertyDescriptors){
                if(propDesc.getName().equals(userName)){
                    Method methodSetUserName = propDesc.getWriteMethod();
                    methodSetUserName.invoke(userInfo, "allen");
                    System.out.println("set username" + userInfo.getUserId());
                    break;
                }
            }
        }

    }
}
