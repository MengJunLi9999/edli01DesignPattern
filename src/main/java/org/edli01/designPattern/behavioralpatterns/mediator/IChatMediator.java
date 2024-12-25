package org.edli01.designpattern.behavioralpatterns.mediator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.mediator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Mediator interface for chat room
 */
public interface IChatMediator {
  void sendMessage(String message, User user);
  void addUser(User user);
} 