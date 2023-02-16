package Test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("xiaomi",1000);
        Phone p2 = new Phone("ios",2999);
        Phone p3 = new Phone("lllsss",8000);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> phoneInfo = getPhoneInfo(list);

        for (int i = 0; i < phoneInfo.size(); i++) {
            Phone phone = phoneInfo.get(i);
            System.out.println(phone.getBrand() + " " + phone.getPrice());
        }
    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if (price<=3000){
                result.add(p);
            }
        }
        return result;
    }


}
