package cn.org.zhixiang.util;

/**
 * 线程安全的计数器类
 *
 */
public final class Counter {
    private long value = 0;


    public synchronized long getValue() {
        return value;
    }

    public synchronized long  increment(long value) {
        if (value==Long.MAX_VALUE) {
            throw new IllegalMonitorStateException("counter overflow");
        }
        return ++value;

    }
}
