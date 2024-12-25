package org.edli01.designpattern.behavioralpatterns.observer;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.observer
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete observer class implementing INewsSubscriber
 */
public class NewsSubscriber implements INewsSubscriber {
  private String name;
  private String category;

  public NewsSubscriber(String name, String category) {
    this.name = name;
    this.category = category;
  }

  @Override
  public void update(String news) {
    System.out.println(name + " (" + category + ") received news: " + news);
  }

  @Override
  public String getName() {
    return name;
  }
} 