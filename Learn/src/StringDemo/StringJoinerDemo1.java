package StringDemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //1.创建对象，指定中间间隔符号
        StringJoiner sj = new StringJoiner(",","[","]");

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();
        System.out.println(len);

        //3.打印结果
        System.out.println(sj);

        //4.转为字符串
        String str = sj.toString();
        System.out.println(str);


    }
}


