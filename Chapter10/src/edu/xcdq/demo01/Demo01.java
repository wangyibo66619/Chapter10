package edu.xcdq.demo01;

/**
 * @author 王艺博
 * @date 2021/5/21 8:59
 */
public class Demo01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("大根的线程1");
        MyThread t2 = new MyThread("大根的线程2");
        MyThread t3 = new MyThread("大根的线程3");
        MyThread t4 = new MyThread("大根的线程4");
        MyThread t5 = new MyThread("大根的线程5");
        // t1.run(); // 普通方法调用

        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(6);
        t4.setPriority(9);
        t5.setPriority(3);

        t1.start();  // 多线程调用
        t2.start();  // 多线程调用
        t3.start();  // 多线程调用
        t4.start();  // 多线程调用
        t5.start();  // 多线程调用
    }
}
