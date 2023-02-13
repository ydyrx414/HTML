package StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.创建两个字符串对象
        String s1 = new String("abc");
        String s2 = "Abc";

        //==比较
        //基本数据类型比的是数据值
        //引用数据类型比的是地址值
        System.out.println(s1 == s2);//false

        //3.==比较字符串对象中的内容是否相等
        boolean result = s1.equals(s2);
        System.out.println(result);

        //4.比较字符串对象中的内容是否相等,忽略大小写
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);


    }
}
