package com.company.multithreading;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        /*
        we always need to call start method to run everything in run method
        it will work correctly only if we run start method not run
        потоки не синхранизированы
        * */

        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();

//        Thread thread = new Thread(new Runner());    //another way how to create a thread
//        thread.start();
//        System.out.println("hello world");

    }
}

class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from DE" + i);
        };
    }
}

/*
* Another way how to create a thread*/

//class Runner implements Runnable{
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Hello from DE" + i);
//        };
//    }
//}