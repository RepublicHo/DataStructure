package DesignPattern;

/**
 * @Author Anthony Z.
 * @Date 16/6/2022
 * @Description: Composite Reuse Principle 合成复用原则
 *
 * 原则是尽量使用聚合的方式，而不是使用继承
 *
 * there are some methods in A class, and we want B class to be using those two methods.
 * If we just make class A inherit class B, then the Coupling of Class A and Class B
 * will be improved. 耦合性太强了 不好。
 * 我们要尽量降低耦合度
 *
 * But actually B doesn't want to use other methods.
 *
 *
 * UML类图，是统一建模语言
 * Dependency 依赖：在类中用到了对方（成员属性，返回类型，方法接受的参数类型，以及在类和方法中用到的）
 * Association 关联 是依赖关系的特例。关联具有导航性，即双向关系或单向关系
 * Generalization 泛化（就是继承）
 * Realization 实现（A类实现了一个接口）
 * Aggregation 聚合：整体和部分可分开
 * Composite 组合：整体和部分不可分开 比如Person\IDCard
 *
 * 画UML类图与写文章差不多，都是把自己的思想描述给别人看
 *
 * 尚硅谷Java设计模式 27课
 */
public class CRP {
}

class Person{
    private IDCard idCard; //这样是单向的，如果IDCard里面也有思想Person类
    // 则关系是双向的
}

class IDCard{

}