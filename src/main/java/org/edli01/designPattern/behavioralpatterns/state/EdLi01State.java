package org.edli01.designpattern.behavioralpatterns.state;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.state
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:00
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the State Pattern
 */
public class EdLi01State {
  public static void main(String[] args) {
    // 創建一個有2個商品的販賣機
    VendingMachine machine = new VendingMachine(2);

    System.out.println("=== First Purchase ===");
    machine.insertCoin();
    machine.selectProduct();

    System.out.println("\n=== Second Purchase ===");
    machine.insertCoin();
    machine.selectProduct();

    System.out.println("\n=== Third Purchase (Sold Out) ===");
    machine.insertCoin();
    machine.selectProduct();
  }
} 