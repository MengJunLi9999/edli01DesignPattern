package org.edli01.designpattern.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.observer
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete subject class implementing INewsAgency
 */
public class NewsAgency implements INewsAgency {
  private List<INewsSubscriber> subscribers;
  private String latestNews;

  public NewsAgency() {
    this.subscribers = new ArrayList<>();
  }

  @Override
  public void registerObserver(INewsSubscriber subscriber) {
    subscribers.add(subscriber);
    System.out.println(subscriber.getName() + " has subscribed to the news agency");
  }

  @Override
  public void removeObserver(INewsSubscriber subscriber) {
    subscribers.remove(subscriber);
    System.out.println(subscriber.getName() + " has unsubscribed from the news agency");
  }

  @Override
  public void notifyObservers(String news) {
    for (INewsSubscriber subscriber : subscribers) {
      subscriber.update(news);
    }
  }

  public void publishNews(String news) {
    this.latestNews = news;
    System.out.println("\nBreaking News: " + news);
    notifyObservers(news);
  }
} 