package edu.xcdq.demo02;

/**
 * @author 王艺博
 * @date 2021/5/21 9:08
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("接口方式实现多线程");
    }
    /*
        1 implements Runnable
        2 实现run方法
        3 创建自定义线程对象，加入到系统线程，start启动
     */
}
