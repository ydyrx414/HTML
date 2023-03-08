package staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    //静态方法
    public static int getMaxAgeStudent(ArrayList<Student> list){
        int max = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if (tempAge >max){
                max = list.get(i).getAge();
            }
        }
        return max;
    }
}
