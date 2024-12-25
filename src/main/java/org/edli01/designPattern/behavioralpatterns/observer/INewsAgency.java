package org.edli01.designpattern.behavioralpatterns.observer;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.observer
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Subject interface for news agency
 */
public interface INewsAgency {
  void registerObserver(INewsSubscriber subscriber);
  void removeObserver(INewsSubscriber subscriber);
  void notifyObservers(String news);
} 