package org.edli01.designpattern.behavioralpatterns.strategy;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.strategy
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:00
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Strategy Pattern
 */
public class EdLi01Strategy {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    // 添加商品
    cart.addItem(new Item("Laptop", 999));
    cart.addItem(new Item("Mouse", 50));
    cart.addItem(new Item("Keyboard", 100));

    // 使用信用卡支付
    cart.setPaymentStrategy(new CreditCardPayment(
      "1234567890123456", "John Doe", "123", "12/25"));
    cart.checkout();

    // 使用PayPal支付
    cart.setPaymentStrategy(new PayPalPayment(
      "john.doe@example.com", "password"));
    cart.checkout();

    // 使用LINE Pay支付
    cart.setPaymentStrategy(new LinePayPayment(
      "john_doe_line", "0912345678"));
    cart.checkout();
  }
} 