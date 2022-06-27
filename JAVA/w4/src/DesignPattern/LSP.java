package DesignPattern;

/**
 * @Author Anthony Z.
 * @Date 5/6/2022
 * @Description: Liskov Substitution Principle 里氏替换原则
 * 告诉我们如何正确地使用继承
 * 1. 子类尽量不要重写父类的方法，如果确实需要，去继承一个跟基础的类（不存在就创建他）
 * 通过依赖，聚合等方法
 * 2. 比如说，一个类被其他的类继承，则当这个类需要修改时，必须考虑所有的子类
 * 尽量避免父类修改后，所有子类的功能发生故障
 */
public class LSP {
}
