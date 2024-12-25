package org.edli01.designpattern.behavioralpatterns.observer;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.observer
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Observer interface for news subscribers
 */
public interface INewsSubscriber {
  void update(String news);
  String getName();
} 