package org.edli01.designpattern.behavioralpatterns.observer;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.observer
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Observer Pattern
 */
public class EdLi01Observer {
  public static void main(String[] args) {
    // 創建新聞社
    NewsAgency newsAgency = new NewsAgency();

    // 創建訂閱者
    INewsSubscriber john = new NewsSubscriber("John", "Sports Fan");
    INewsSubscriber alice = new NewsSubscriber("Alice", "Politics Enthusiast");
    INewsSubscriber bob = new NewsSubscriber("Bob", "Technology Geek");

    // 訂閱新聞
    newsAgency.registerObserver(john);
    newsAgency.registerObserver(alice);
    newsAgency.registerObserver(bob);

    // 發布一些新聞
    newsAgency.publishNews("Major sports event announced for 2024!");
    
    // 取消訂閱
    newsAgency.removeObserver(alice);
    
    // 發布更多新聞
    newsAgency.publishNews("New technology breakthrough in AI!");
  }
} 