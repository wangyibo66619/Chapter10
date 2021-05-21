package edu.xcdq.demo01;

/**
 * @author 王艺博
 * @date 2021/5/21 9:00
 */
public class MyThread extends Thread{

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("自定义的线程类，继承自Thread");
        System.out.println(Thread.currentThread().getName());
    }



    /*
        1 extends Thread
        2 复写run方法  ctrl + o
        3 调用start()
     */
}
