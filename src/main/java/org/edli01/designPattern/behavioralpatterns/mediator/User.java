package org.edli01.designpattern.behavioralpatterns.mediator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.mediator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Abstract user class
 */
public abstract class User {
  protected IChatMediator mediator;
  protected String name;

  public User(IChatMediator mediator, String name) {
    this.mediator = mediator;
    this.name = name;
  }

  public abstract void send(String message);
  public abstract void receive(String message);
} 