package Interface;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer =  new Computer();

        computer.powerOn();

        Mouse mouse = new Mouse();  //向上转型
        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();  //没有使用多态   //方法参数是USB类型，传递进去的是实现类
        computer.useDevice(keyboard);     //自动向上转型

        computer.powerOff();

    }
}
