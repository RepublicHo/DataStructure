package DesignPattern;

import java.security.InvalidParameterException;

/**
 * @Author Anthony Z.
 * @Date 13/6/2022
 * @Description: Open Closed Principle 开闭原则
 * 是编程中最基础，最重要的原则。 “the most important principle of object-oriented design”
 *
 * “Software entities (classes, modules, functions, etc.) should be open for extension,
 * but closed for modification.”
 * 类，模块和函数应该对扩展开放（对提供方），对修改关闭（对使用方）
 *
 * 当我们要修改软件，应该尽量去扩展软件的行为，而不是去修改。因为要修改的类可能在别的地方被使用
 */
public class OCP {

}

interface CalculatorOperation {
    void perform();
}

class Addition implements CalculatorOperation{
    private double left;
    private double right;
    private double result = 0.0;

    Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform() {
        // 如果Interface没有这个method，然后仅仅靠calculator写
        result = left + right;
    }
}

class Subtraction implements CalculatorOperation {
    private double left;
    private double right;
    private double result = 0.0;

    Subtraction(double left, double right) {
        this.left = left;
        this.right = right;
    }

    // getters and setters

    @Override
    public void perform() {
        result = left - right;
    }
}

class Calculator{ // 使用方
    public void calculate(CalculatorOperation operation){
        if(operation == null){
            throw new InvalidParameterException("Cannot perform the operation");

        }
//          we should close for modification. //        if(operation instanceof Addition){
//            Addition addition = (Addition) operation;
//            调用get 然后再加起来得到结果 最后在set
//        }
        operation.perform();
    }
}