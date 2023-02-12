package HelloWorld;

public class Methoddemo2 {
    public static void main(String[] args) {
        int[] arr = {1,6,8,9,3,5,4};

        System.out.println(getMax(arr));
    }

    public static int getMax(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >max){
                max = arr[i];
            }
        }
        return max;
    }
}
