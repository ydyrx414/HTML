package extendsdemo2;

public class ChineseDog extends Dog {
    //需要重写吃饭
    @Override
    public void eat(){
        System.out.println("吃剩饭");
    }
}
