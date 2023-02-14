package StringDemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.定义正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        //2.键盘录入用户名和密码
        for (int i=0;i<3;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入用户名：");
            String username = sc.next();
            System.out.println("输入用密码：");
            String password = sc.next();

            //3.比较
            if (username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("登录成功");
                break;
            }
            else {
                System.out.println("登录失败,还剩下"+ (2-i) + "次机会");
            }
        }


    }
}
