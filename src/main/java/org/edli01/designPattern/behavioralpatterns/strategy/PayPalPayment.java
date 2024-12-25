package org.edli01.designpattern.behavioralpatterns.strategy;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.strategy
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete strategy for PayPal payment
 */
public class PayPalPayment implements IPaymentStrategy {
  private String email;
  private String password;

  public PayPalPayment(String email, String password) {
    this.email = email;
    this.password = password;
  }

  @Override
  public void pay(int amount) {
    System.out.println(amount + " paid using PayPal");
    System.out.println("PayPal Account: " + email);
  }

  @Override
  public String getPaymentMethod() {
    return "PayPal";
  }
} 