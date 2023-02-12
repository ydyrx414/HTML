package JavaBean;

public class GameTest {
    public static void main(String[] args) {
        //创建第一个角色
        Role r1 = new Role("张三",100,'男');
        //创建第二个角色
        Role r2 = new Role("李四",100,'女');

        //展示信息
        r1.showRoleInfo();
        r2.showRoleInfo();

        while (true){
            //第一个角色攻击
            r1.attack(r2);
            if (r2.getBlood()==0){
                System.out.println(r1.getName() + "击败了" + r2.getName());
                break;
            }
            //第二个角色攻击
            r2.attack(r1);
            if (r1.getBlood()==0){
                System.out.println(r2.getName() + "击败了" + r1.getName());
                break;
            }

        }
    }
}
