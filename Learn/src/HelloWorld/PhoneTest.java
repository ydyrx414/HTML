package HelloWorld;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        p.brand = "xiaomi";
        p.price = 1999.3;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.playgame();
    }
}
