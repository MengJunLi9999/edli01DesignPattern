package org.edli01.designpattern.behavioralpatterns.strategy;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.strategy
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete strategy for credit card payment
 */
public class CreditCardPayment implements IPaymentStrategy {
  private String cardNumber;
  private String name;
  private String cvv;
  private String dateOfExpiry;

  public CreditCardPayment(String cardNumber, String name, String cvv, String dateOfExpiry) {
    this.cardNumber = cardNumber;
    this.name = name;
    this.cvv = cvv;
    this.dateOfExpiry = dateOfExpiry;
  }

  @Override
  public void pay(int amount) {
    System.out.println(amount + " paid using Credit Card");
    System.out.println("Card Holder: " + name);
    System.out.println("Card Number: " + maskCardNumber());
  }

  @Override
  public String getPaymentMethod() {
    return "Credit Card";
  }

  private String maskCardNumber() {
    return "xxxx-xxxx-xxxx-" + cardNumber.substring(cardNumber.length() - 4);
  }
} 