package main;

import constructed.Duck;
import constructed.LittleDuck;

import static constructed.Duck.duckCount;

/**
 * @author chenheyang
 * @date 2019/10/30 - 7:28 下午
 */
public class Main {

    public static void main(String[] args) {
        Duck A = new Duck();
        Duck jack = new Duck("Jack's ",20);
        System.out.println("_______________________");

        LittleDuck a = new LittleDuck();
        LittleDuck jackLittle = new LittleDuck("Jack's  little",10);
        System.out.println("_______________________");

        System.out.println("Count of duck is " + duckCount + ".");
    }
}
