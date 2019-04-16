package Test;
/*
java的线程创建方式：
0.
   线程的启动时通过start方法
   如果调用run方法，跟普通的对象调用方法没有区别，跟线程没关
   start方法只能调用一次 否则会抛出异常
1. 继承Thread类，覆写run方法
2.实例化子类实现Runnable接口，通过Thread（Runnable target），构造实例化Thread对象
  继承Thread                    vs       实现Runnable
  单继承，不能在再次继承其他类            多继承
  线程的调度跟业务耦合                    业务独立，可以复用（共享）
  定义字儿里实现callable接口，通过Thread 和 future 构造实例化对象 通过future.get方法获取结果
3.线程池 线程工厂
4.线程的方法
  1.通过Thread.currentThread()获取执行当前代码的线程
  2.java的main方法，程序入口，他也在线程中执行
  3.线程是java应用程序执行的最小单元
  4.创建线程时，如果不指定线程名  Thread-index(0,1,2)
    穿件线程时通过构造方法，或者setName是指线程名称
  5.sleep 睡眠 暂停线程，交出cpu不释放锁
  6.yield 让步 暂停线程，交出cpu（时间不确定）不释放锁，cpu时间片段只能供给相同优先级，回到就绪
  7.join  在一个想成a中执行另一个线程b的join方法，那么线程a阻塞，知道线程b执行完毕，线程a继续执行（回到就绪）
  8.线程停止
    8.1 标记位的方式
    8.2 stop方法 弃用
    8.3 interrupted 中断线程
  9.主方法是一个中等优先级的线程 5
    线程的优先级具有继承性
    线程的优先级最大，越有可能先执行
  10.线程分类
     用户线程 main线程就是用户线程，用户创建的线程（Daemon false）
     守护线程 陪伴线程，当我们的jvm最后一个用户线程退出，守护线程（一直运行）自动退出
 */