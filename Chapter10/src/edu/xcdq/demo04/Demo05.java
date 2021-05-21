package edu.xcdq.demo04;

/**
 * @author 王艺博
 * @date 2021/5/21 10:17
 */
public class Demo05 {
    public static void main(String[] args) {
        Runnable maipiao = new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    System.out.println(
                            Thread.currentThread().getName() +
                                    "卖出一张票还剩：" + (--TicketContent.count) + "张");
                }
            }
        };

        new Thread(maipiao, "窗口1").start();
        new Thread(maipiao, "窗口2").start();
        new Thread(maipiao, "窗口3").start();
        new Thread(maipiao, "窗口4").start();
        new Thread(maipiao, "窗口5").start();
    }
}
