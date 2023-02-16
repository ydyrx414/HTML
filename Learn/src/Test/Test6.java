package Test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<User> list = new ArrayList<>();

        //2.创建三个用户对象
        User u1 = new User("001", "zhangsan", "123456");
        User u2 = new User("002", "lisi", "1234567");
        User u3 = new User("003", "wangwu", "12345678");

        //3.把用户添加到集合中
        list.add(u1);
        list.add(u3);
        list.add(u2);

        //4.查找索引
        int index = getIndex(list, "001");
        System.out.println(index);
    }

    public static int getIndex(ArrayList<User> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            String uid = list.get(i).getId();
            if (uid.equals(id)) {
                return i;
            }
        }
        return -1;
    }


}
