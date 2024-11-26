package thread;

import java.util.concurrent.*;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/10/26 10:13
 * @Version V1.0
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = new ThreadPoolExecutor(2,  //核心线程数
                5,  //最大线程数
                3,  //过期时间（等待时间，过时不候）
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3), //阻塞队列
                Executors.defaultThreadFactory(),  //线程工程，一般为默认
                new ThreadPoolExecutor.CallerRunsPolicy());  //拒绝策略

        try {
            for (int i = 1; i <= 10; i++) {
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName() + " ok");
                });
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }finally {
            threadPool.shutdown();
        }
    }
}
