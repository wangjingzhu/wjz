package lianxi10;

public class thorwsMain {
    public static void main(String[] args) throws Exception {
        try {
            show("d\\a.txt");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("和try一起用，无论有无异常都打印输出");
        }
        System.out.println("继续执行");
    }

    private static void show(String name) throws Exception {
        if (!name.endsWith(".txt")){
            throw new  Exception("地址后缀名错误！");
        }else if (!name.equals("c\\a.txt")){
            throw new Exception("地址错误！");
        }
        System.out.println("地址正确！");
    }
}
