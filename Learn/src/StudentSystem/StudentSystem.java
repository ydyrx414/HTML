package StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {


    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        boolean falg = true;//判断退出的变量
        while (falg) {
            System.out.println("----------欢迎来到学生管理系统------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择");

            Scanner sc = new Scanner(java.lang.System.in);
            String choose = sc.next();

            switch (choose) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5":
                    java.lang.System.out.println("退出成功");
                    falg = false;
                    break;
                default:
                    java.lang.System.out.println("没有这个选项");
                    break;
            }
        }
    }

    //1.添加学生
    public static void addStudent(ArrayList<Student> list) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生id");
            String id = sc.next();
            boolean flge = contains(list, id);
            if (flge) {
                //表示id存在，需要重新录入
                System.out.println("id已经存在，请重新录入");
            } else {
                //表示id可以正常录入
                s.setId(id);
                break;
            }
        }


        System.out.println("请输入学生姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生家庭地址");
        String address = sc.next();
        s.setAddress(address);


        list.add(s);//添加到集合中

        System.out.println("添加成功");//提示用户


    }

    //2.删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = sc.next();
        //查询id在集合中的索引
        int index = geiIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为" + id + "的学生删除成功");
        } else {
            System.out.println("id不存在，删除失败");
        }


    }

    //3.修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的id");
        String id = sc.next();
        int index = geiIndex(list, id);
        if (index == -1) {
            System.out.println(id + "的学生不存在，修改失败,请重新输入");
            return;
        }

        Student stu = list.get(index);//获取要修改的学生对象

        //输入新信息
        System.out.println("请输入要修改的学生姓名");
        String newname = sc.next();
        stu.setName(newname);

        System.out.println("请输入要修改的学生年龄");
        stu.setAge(sc.nextInt());
        System.out.println("请输入要修改的学生家庭住址");
        stu.setAddress(sc.next());

        System.out.println("学生信息修改成功");
    }

    //4.查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前没有学生信息,请添加后运行");
            return;
        }
        System.out.println("id\t" + "姓名\t" + "年龄\t" + "家庭住址\t");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress() + "\t");

        }


    }

    //判断id是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)){
                return true;
            }
        }
        return geiIndex(list, id) >= 0;
    }

    //通过id获取索引
    public static int geiIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
