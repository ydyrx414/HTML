package HelloWorld;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int number1;
        int number2;
        String result;
        //int max;

        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2 = sc.nextInt();

        //max = number1>number2?number1:number2;
        result = number1==number2? "相同": "不相同";
        System.out.println(result);

    }
}
