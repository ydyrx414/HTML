package JavaBean;

import java.util.Random;

public class Role {
    //用户名
    private String name;
    //血量
    private int blood;
    //性别
    private char gender;
    //长相
    private String face;

    String[] boyfaces = {"英明神武", "气宇不凡", "风流倜傥"};
    String[] girlfaces = {"闭月羞花", "国色天香", "倾国倾城"};

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();

        //随机长相
        if (gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "啥也不是";
        }
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //攻击方式
    public void attack(Role role) {
        //计算造成伤害1-20
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //剩余血量
        int remainBoold = role.getBlood() - hurt;

        //判断剩余血量，如果为负数则血量为0
        remainBoold = remainBoold < 0 ? 0 : remainBoold;

        //修改被攻击的人的血量
        role.setBlood(remainBoold);

        //this表示该方法的调用者
        System.out.println(this.getName() + "攻击了" + role.getName()
                + "造成了" + hurt + "点伤害" + role.getName() + "还剩下" + remainBoold + "点血");
    }

    public void showRoleInfo() {
        System.out.println("姓名为" + getName());
        System.out.println("血量为" + getBlood());
        System.out.println("性别为" + getGender());
        System.out.println("长相为" + getFace());
    }


}
