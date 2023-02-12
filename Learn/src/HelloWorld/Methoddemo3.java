package HelloWorld;

public class Methoddemo3 {
    public static void main(String[] args) {
        int[] arr = {11,33,55,66,88,44,12};

        System.out.println(contains(arr,87));
    }

    public static boolean contains(int[] arr ,int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number){
                return true;
            }
        }
        return false;
    }
}
