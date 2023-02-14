package StringDemo;

import java.util.Scanner;

public class StringBuilderdemo1 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str1 = sc.next();

        //2.翻转字符串
        String result = new StringBuilder().append(str1).reverse().toString();

        //3.判断
        if (str1.equals(result)){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }

    }
}
