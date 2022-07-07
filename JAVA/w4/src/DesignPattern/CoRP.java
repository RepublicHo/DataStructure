package DesignPattern;

/**
 * @Author Anthony Z.
 * @Date 27/6/2022
 * @Description: Chain of Responsibilities Pattern 责任链模式
 * 将链中每一个节点看作是一个对象，每个节点处理的请求均不同，
 * 当一个请求从链式的首端发出时，会沿着链的路径依次传递给每一个节点对象，、
 * 直到有对象处理这个请求为止
 */
public class CoRP {
}

abstract class Handler{
    protected Handler nextHandler;
    public void setNextHandler(Handler successor){
        this.nextHandler = successor;
    }
    public abstract void handleRequest(String request);
}