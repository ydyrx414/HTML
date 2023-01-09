package HelloWorld;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("百位是：" + i / 100 % 10);//百位
        System.out.println( i / 10 % 10);//十位
        System.out.println( i % 10);//个位
    }
}
