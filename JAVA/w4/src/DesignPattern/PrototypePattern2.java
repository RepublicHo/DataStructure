package DesignPattern;

/**
 * @Author Anthony Z.
 * @Date 16/7/2022
 * @Description:
 * 浅拷贝
 * 对于基本数据类型，浅拷贝会将属性值复制一份给新的对象
 * 对于引用数据类型，浅拷贝会进行引用传递，即将内存地址复制一份给新的对象。
 * 在这种情况下，修改一个该成员变量的值会影响到另一个对象的值。
 *
 * 深拷贝
 * 为所有引用数据类型申请存储空间
 * 两种实现方式
 * 1. clone
 * 2. 对象序列化
 *
 */
public class PrototypePattern2 {
}
