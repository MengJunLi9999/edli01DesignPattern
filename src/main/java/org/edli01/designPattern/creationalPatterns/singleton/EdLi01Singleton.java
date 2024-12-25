package org.edli01.designpattern.creationalpatterns.singleton;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.creationalpatterns.singleton
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-09-27 18:05
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Implement the Singleton Pattern in design patterns.
 **/
public class EdLi01Singleton {
  public static void main (String[] args) {
    try {
      System.out.println("--------------------------------------");
      System.out.println("SingletonTransaction start.");
      System.out.println("Create two threads.");
      Thread thread01 = new Thread(new Thread01CreateTransaction01());
      Thread thread02 = new Thread(new Thread02CreateTransaction02());
      System.out.println("Execute two threads.");
      thread01.start();
      thread02.start();
      System.out.println("Wait for two threads.");
      thread01.join();
      thread02.join();
      System.out.println("SingletonTransaction end.");
      System.out.println("--------------------------------------");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static class Thread01CreateTransaction01 implements Runnable {
    @Override
    public void run() {
      Singleton instanceObject = Singleton.getInstance("Transaction01");
      System.out.println("Thread01 : " + instanceObject.transaction);
    }
  }

  public static class Thread02CreateTransaction02 implements Runnable {
    @Override
    public void run() {
      Singleton instanceObject = Singleton.getInstance("Transaction02");
      System.out.println("Thread02 : " + instanceObject.transaction);
    }
  }
}
