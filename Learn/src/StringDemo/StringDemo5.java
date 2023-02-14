package StringDemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2.统计字符出现次数
        //定义三个计数器，分别为大写字母，小写字母，数字
        int bigCount =0;
        int smallCount =0;
        int numberCount =0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >='a' && c <= 'z'){
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >='0' && c <= '9') {
                numberCount++;
            }
        }

        System.out.println("小写字母有" + smallCount);
        System.out.println("大写子母有" + bigCount);
        System.out.println("数字有" + numberCount);

    }
}
