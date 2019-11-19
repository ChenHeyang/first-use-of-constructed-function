package constructed;

import javax.naming.Name;

/**
 * @author chenheyang
 * @date 2019/10/30 - 7:19 下午
 */
public class Duck {
    private int size;
    private String name;
    public static int duckCount;

    public Duck(){           //Default size
        this("Default",10);
        //this的使用：1.访问构造函数（必须在第一行）
    }

    public Duck(String name,int size){   //Input size(overload)
        this.name = name;
        this.size = size;
        //this的使用：2.访问成员变量（形参与成员变量重名时使用）

        this.printIn();
        //this的使用：3.访问成员方法（这个this可以不写）
    }

    public void printIn(){
        System.out.println(name + " duck is " + size + " Kg.");
        duckCount++;
    }
}
