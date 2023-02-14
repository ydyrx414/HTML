package StringDemo;

public class StringBuilderdemo {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb =  new StringBuilder();

        //2.添加元素
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");

        //sb.reverse();//翻转

        System.out.println(sb);

        //3.把StringBuilder变为字符串
        String s = sb.toString();
        System.out.println(s);


    }
}
