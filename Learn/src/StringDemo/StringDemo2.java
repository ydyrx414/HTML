package StringDemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //1.键盘录入abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str1 = sc.next();

        //2.定义一个abc
        String str2 = "abc";

        //3.==比较是否一样
        System.out.println(str1==str2);//false

        //结论：
        //以后比较需要用到String里的方法
    }
}
