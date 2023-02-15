package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2.键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Student s = new Student();
            System.out.println("输入学生姓名");
            String name = sc.next();
            System.out.println("输入学生年龄");
            int age = sc.nextInt();

            //3.把学生对象添加到集合中
            s.setName(name);
            s.setAge(age);

            list.add(s);
        }

        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + " ," + stu.getAge());
        }

    }
}
