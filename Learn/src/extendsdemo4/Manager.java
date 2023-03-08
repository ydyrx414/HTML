package extendsdemo4;

public class Manager extends Employee {
    private double bouns;

    //空参构造
    public Manager(double bouns) {
    }

    //带全部参数的构造
    //父类+子类
    public Manager(String id, String name, double dalary, double bouns) {
        super(id, name, dalary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
