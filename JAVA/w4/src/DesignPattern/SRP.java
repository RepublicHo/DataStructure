package DesignPattern;

/**
 * @Author Anthony Z.
 * @Date 29/5/2022
 * @Description: Single responsibility principle 单一职责原则
 * 一个class应该只负责一项职责 可在method上细分
 * 降低复杂度，提高类的可读性，降低变更所带来的风险
 *
 * every module, class or function in a computer program should have responsibility over
 * a single part of that program's functionality, and it should encapsulate that part.
 *
 */
public class SRP {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.runRoad("Car");
        vehicle.runWater("Submarine");
    }
}

class Vehicle{
    // 虽然没有在类这个级别上遵守单一职责，但是在方法级别上，仍然遵守单一职责
    public void runRoad(String s){
        System.out.println(s + "is running on the road");
    }
    public void runSky(String s){
        System.out.println(s + "is running in the air");
    }
    public void runWater(String s){
        System.out.println(s + "is running beneath the water");
    }
}
