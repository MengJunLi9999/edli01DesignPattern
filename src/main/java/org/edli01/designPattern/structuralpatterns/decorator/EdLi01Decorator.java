package org.edli01.designpattern.structuralpatterns.decorator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.decorator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:56
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Decorator Pattern
 */
public class EdLi01Decorator {
  public static void main(String[] args) {
    // 訂購一杯濃縮咖啡
    IBeverage beverage1 = new Espresso();
    System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    // 訂購一杯雙倍摩卡加奶泡的黑咖啡
    IBeverage beverage2 = new HouseBlend();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    // 訂購一杯豆漿摩卡加奶泡的濃縮咖啡
    IBeverage beverage3 = new Espresso();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
  }
} 