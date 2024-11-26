package thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/10/23 21:18
 * @Version V1.0
 */
public class test01 {

    public static void main(String[] args) {
        Phone1 phone1 = new Phone1();
        new Thread(()->{
            for (int i = 1; i <= 50; i++) {
                phone1.t1();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 1; i <= 50; i++) {
                phone1.t2();
            }
        },"A").start();
    }
}
class Phone1{
    public static int tick=100;
    Lock lock = new ReentrantLock();
    public void t1()  {

        lock.lock();
        System.out.println("AAAAA剩余" + (--tick));
        lock.unlock();
    }

    public void t2() {

        lock.lock();
        System.out.println("BBBB剩余" + (--tick));
        lock.unlock();
    }
}
