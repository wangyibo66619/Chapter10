package edu.xcdq.demo02;

/**
 * @author 王艺博
 * @date 2021/5/21 9:08
 */
public class Demo02 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();


    }
}
