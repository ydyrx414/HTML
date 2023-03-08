package extendsdemo2;

public class SharPei extends Dog {
    //吃饭不一样，父类的方法不满足，需要重写
    @Override
    public void eat(){
        super.eat();//吃狗粮
        System.out.println("狗啃骨头");
    }
}
