package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("My Cooking Thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("My Thread 2 for chatting with her");
            System.out.println("I am Sad");
            i++;
        }
    }
}
public class cwh_70_threads {
    public static void main(String[] args) {
       MyThread1 t1 = new MyThread1();
       MyThread2 t2 = new MyThread2();
          t1.start();
       t2.start();
    }
}