package org.edli01.designpattern.behavioralpatterns.strategy;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.strategy
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Strategy interface for payment methods
 */
public interface IPaymentStrategy {
  void pay(int amount);
  String getPaymentMethod();
} 