package Test;

public class Testb {
}
class MyRunnable implements Runnable{
    private String title ;
    public MyRunnable(String title) {
        this.title = title;
    }
    @Override
    public void run() { // 所有线程从此处开始执行
        for (int i = 0; i < 10 ; i++) {
            System.out.println(this.title+",i = " + i);
        }
    }
}
