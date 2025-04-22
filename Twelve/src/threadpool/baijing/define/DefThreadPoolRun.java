package threadpool.baijing.define;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DefThreadPoolRun {
    public static void main(String[] args) {

        /*
        参数 1 ： 核心线程数量 ，大于等于 0
        参数 2 ： 最大线程数 ， 大于0 ， MAX Number 大于等于 核心线程数量
        参数 3 ： 空闲线程最大存活时间  ， 大于等于 0
        参数 4 ： 时间单位 ， 用 Timeunit 指定
        参数 5 ： 任务队列 ， 不能为 null
        参数 6 ： 创建线程工厂 ， 不能为 null
        参数 7 ： 任务拒绝策略 ， 不能为 null
         */

        ThreadPoolExecutor defpool = new ThreadPoolExecutor(
                3,   // 核心线程数量
                6,   // 最大线程数量 ， 临时线程数量 6 -3
                60,  // 空闲最大存活时间
                TimeUnit.SECONDS,   // 时间单位 ， 秒
                new ArrayBlockingQueue<>(3), // 任务队列
                Executors.defaultThreadFactory(), // 创建线程工厂
                new ThreadPoolExecutor.AbortPolicy() // 任务拒绝策略 , AbortPolicy 是一个静态内部类
        );



    }
}
