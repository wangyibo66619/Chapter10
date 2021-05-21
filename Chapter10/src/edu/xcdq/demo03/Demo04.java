package edu.xcdq.demo03;

/**
 * @author 王艺博
 * @date 2021/5/21 10:04
 */
public class Demo04 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("线程1");
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("线程2");
            }
        };
        Thread t3 = new Thread() {
            @Override
            public void run() {
                System.out.println("线程3");
            }
        };

        new Thread() {
            @Override
            public void run() {
                try {
                    t1.join();  // 线程的插队操作，会按照顺序执行
                    t2.join();
                    t3.join();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("主线程在运行");
            }
        }.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
