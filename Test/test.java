//package Test;
//
//import java.util.Arrays;
//import java.util.HashSet;
//
//public class test {
//    public static void main(String[] args) {
//        String s = "pwwkew";
//        HashSet<Character> characters = new HashSet<>();
//        characters.add()
//    }
//}
//
//class MyThread implements Runnable {
//    private Integer tick = 30;
//
//    @Override
//    public void run() {
//        while (tick > 0) {
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            if (tick == 0)break;
//            sale();
//        }
//    }
//
//    public synchronized void sale() {
//        System.out.println(Thread.currentThread().getName() + "卖票，剩余" + (--this.tick));
//    }
//}
