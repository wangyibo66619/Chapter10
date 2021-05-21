package edu.xcdq.demo04;

/**
 * @author 王艺博
 * @date 2021/5/21 11:20
 */
public class demo {
    public static void main(String args[]) {

        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };

        t.run();
        System.out.print("ping");
    }

    static void pong() {
        System.out.print("pong");
    }
}
