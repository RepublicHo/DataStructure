package DesignPattern;


/**
 * @Author Anthony Z.
 * @Date 13/7/2022
 * @Description: 就拿程序员最喜欢的电脑来说，假设现在要生产多种电脑，
 * 电脑有屏幕，鼠标，cpu，主板，磁盘，内存等等，我们可能立马就能写出来
 *
 * 如果是创建简单对象，通常都是使用工厂模式进行创建
 * 如果是创建复杂对象，就可以考虑使用建造者模式
 *
 * 比较一个对get, set. 流水线会好一些。
 * https://www.zhihu.com/question/21857130/answer/19531872
 */
public class BuilderPattern {
    public static void main(String[] args) {
        Computer1 computer1 = new Computer1()
                .setScreen("高清屏幕")
                .setMouse("罗技鼠标")
                .setCpu("i7处理器")
                .setMainBoard("联想主板")
                .setMemory("32G内存")
                .setDisk("512G磁盘");
        Computer2 computer2 = new Computer2.Builder()
                .setScreen("高清屏幕")
                .setMouse("罗技鼠标")
                .setCpu("i7处理器")
                .setMainBoard("联想主板")
                .setMemory("32G内存")
                .setDisk("512G磁盘")
                .build();

    }
}

class Computer1{

    private String screen;
    private String mouse;
    private String cpu;
    private String mainBoard;
    private String disk;
    private String memory;

    public Computer1 setScreen(String screen) {
        this.screen = screen;
        return this;
    }

    public Computer1 setMouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    public Computer1 setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public Computer1 setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
        return this;
    }

    public Computer1 setDisk(String disk) {
        this.disk = disk;
        return this;
    }

    public Computer1 setMemory(String memory) {
        this.memory = memory;
        return this;
    }
}

class Computer2{
    private String screen;
    private String mouse;
    private String cpu;
    private String mainBoard;
    private String disk;
    private String memory;

    Computer2(Builder builder) {
        this.cpu = builder.cpu;
        this.disk = builder.disk;
        this.mainBoard = builder.mainBoard;
        this.memory = builder.memory;
        this.mouse = builder.mouse;
        this.screen = builder.screen;

    }

    public static class Builder{
        private String screen;
        private String mouse;
        private String cpu;
        private String mainBoard;
        private String disk;
        private String memory;
        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder setMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Builder setDisk(String disk) {
            this.disk = disk;
            return this;
        }

        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public Computer2 build(){
            return new Computer2(this);
        }
    }
}