package Interface;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }
    public void useDevice(USB usb){
        usb.Open();
        usb.Close();
        if (usb instanceof Mouse ){  //先判然
            Mouse mouse = (Mouse) usb; //向下转型
            mouse.Cleck();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard =(Keyboard) usb;
            keyboard.type();
        }
    }
}
