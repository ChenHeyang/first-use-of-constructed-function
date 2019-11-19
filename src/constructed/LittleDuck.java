package constructed;

import javafx.css.Size;

/**
 * @author chenheyang
 * @date 2019/11/20 - 12:55 上午
 */
public class LittleDuck extends Duck{
    public LittleDuck(){
        super("Default little",5);
    }

    public LittleDuck(String name,int size){
        super(name,size);
        //super的使用：调用含参的父类构造函数
    }
}
