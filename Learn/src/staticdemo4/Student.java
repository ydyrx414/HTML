package staticdemo4;

public class Student {
    String name;
    int age;
    static String teacherName;

    public void show1(){
        System.out.println(name + "," + age + "," + teacherName);
    }

    public static void method(){
        System.out.println("静态方法");
    }
}
