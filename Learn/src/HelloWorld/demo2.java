package HelloWorld;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int result;

        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        //判断式？结果1：结果2；可以套娃
        result = (n1>n2?n1:n2)>n3?(n1>n2?n1:n2):n3;

        System.out.println(result);
    }
}
