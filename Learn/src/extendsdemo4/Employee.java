package extendsdemo4;

public class Employee {
    //1.类名
    //2.所有成员变量私有
    //3.构造方法
    //4.get/set

    private String id;
    private String name;
    private double salary;


    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return dalary
     */
    public double getDalary() {
        return salary;
    }

    /**
     * 设置
     * @param dalary
     */
    public void setDalary(double dalary) {
        this.salary = dalary;
    }

    //工作
    public void work(){
        System.out.println("员工在工作");
    }

    //吃饭
    public void eat(){
        System.out.println("吃米饭");
    }
}
