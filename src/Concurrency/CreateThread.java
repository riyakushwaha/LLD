package Concurrency;

public class CreateThread {
    public static class MyThread extends  Thread{
        @Override
        public void run(){
            System.out.println("running: "+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        System.out.println("running: main "+Thread.currentThread().getName());

        Thread mytHREAD = new Thread(()-> System.out.println("running implements: "+Thread.currentThread().getName()));
        mytHREAD.start();
    }
}
