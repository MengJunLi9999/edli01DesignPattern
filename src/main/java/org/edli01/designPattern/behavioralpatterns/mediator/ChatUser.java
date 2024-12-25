package org.edli01.designpattern.behavioralpatterns.mediator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.mediator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete user class
 */
public class ChatUser extends User {
  public ChatUser(IChatMediator mediator, String name) {
    super(mediator, name);
  }

  @Override
  public void send(String message) {
    System.out.println(name + " sends: " + message);
    mediator.sendMessage(message, this);
  }

  @Override
  public void receive(String message) {
    System.out.println(name + " receives: " + message);
  }
} 