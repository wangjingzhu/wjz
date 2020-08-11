package lianxi5;

public class wqe {
    private String name;
    private int age;
    static String room;

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        wqe.room = room;
    }

    public wqe(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public wqe() {
    }

}
