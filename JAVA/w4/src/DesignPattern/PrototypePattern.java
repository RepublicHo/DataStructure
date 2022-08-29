package DesignPattern;

/**
 * @Author Anthony Z.
 * @Date 12/7/2022
 * @Description: Prototype Pattern 原型模式：指的是
 * 原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * Prototype allows us to hide the complexity of
 * making new instances from the client.
 * 调用者不需要知道任何创建细节，不调用构造函数。
 *
 * The prototype pattern is a creational design pattern.
 * Prototype patterns are required, when object creation is time consuming,
 * and costly operation, so we create objects with the existing object itself.
 *
 * 浅拷贝
 */
public class PrototypePattern {
}

interface IPrototype<T>{
    T clone();
}

class ConcretePrototype implements IPrototype{

    @Override
    public ConcretePrototype clone() {
        return null;
    }
}