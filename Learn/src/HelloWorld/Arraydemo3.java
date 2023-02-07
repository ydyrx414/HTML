package HelloWorld;

import java.util.Scanner;

public class Arraydemo3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {//从键盘获取数组输入
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
