package org.edli01.designpattern.behavioralpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.mediator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete mediator class
 */
public class ChatRoom implements IChatMediator {
  private List<User> users;

  public ChatRoom() {
    this.users = new ArrayList<>();
  }

  @Override
  public void sendMessage(String message, User user) {
    for (User u : users) {
      // 訊息不傳給發送者本人
      if (u != user) {
        u.receive(message);
      }
    }
  }

  @Override
  public void addUser(User user) {
    users.add(user);
    System.out.println(user.name + " joined the chat room");
  }
} 