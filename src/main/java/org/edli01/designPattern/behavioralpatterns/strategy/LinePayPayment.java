package org.edli01.designpattern.behavioralpatterns.strategy;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.strategy
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete strategy for LINE Pay payment
 */
public class LinePayPayment implements IPaymentStrategy {
  private String lineId;
  private String phoneNumber;

  public LinePayPayment(String lineId, String phoneNumber) {
    this.lineId = lineId;
    this.phoneNumber = phoneNumber;
  }

  @Override
  public void pay(int amount) {
    System.out.println(amount + " paid using LINE Pay");
    System.out.println("LINE ID: " + lineId);
    System.out.println("Phone Number: " + phoneNumber);
  }

  @Override
  public String getPaymentMethod() {
    return "LINE Pay";
  }
} 