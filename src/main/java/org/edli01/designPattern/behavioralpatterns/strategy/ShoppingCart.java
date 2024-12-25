package org.edli01.designpattern.behavioralpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.strategy
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Context class for shopping cart
 */
public class ShoppingCart {
  private List<Item> items;
  private IPaymentStrategy paymentStrategy;

  public ShoppingCart() {
    this.items = new ArrayList<>();
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void removeItem(Item item) {
    items.remove(item);
  }

  public int calculateTotal() {
    return items.stream().mapToInt(Item::getPrice).sum();
  }

  public void setPaymentStrategy(IPaymentStrategy strategy) {
    this.paymentStrategy = strategy;
    System.out.println("\nPayment method set to: " + strategy.getPaymentMethod());
  }

  public void checkout() {
    int amount = calculateTotal();
    System.out.println("\nProcessing payment for amount: " + amount);
    paymentStrategy.pay(amount);
  }
} 