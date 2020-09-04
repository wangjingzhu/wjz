package Interface;

public class Mouse implements USB{
    @Override
    public void Open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void Close() {
        System.out.println("关闭鼠标");
    }
    public void Cleck(){
        System.out.println("鼠标点击");
    }

}
