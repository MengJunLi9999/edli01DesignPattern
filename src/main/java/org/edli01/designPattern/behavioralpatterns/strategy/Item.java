package org.edli01.designpattern.behavioralpatterns.strategy;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.strategy
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:55
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Item class for shopping cart
 */
public class Item {
  private String name;
  private int price;

  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }
} 