package org.edli01.designpattern.behavioralpatterns.mediator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.mediator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Mediator Pattern
 */
public class EdLi01Mediator {
  public static void main(String[] args) {
    IChatMediator chatRoom = new ChatRoom();

    User john = new ChatUser(chatRoom, "John");
    User robert = new ChatUser(chatRoom, "Robert");
    User alice = new ChatUser(chatRoom, "Alice");

    chatRoom.addUser(john);
    chatRoom.addUser(robert);
    chatRoom.addUser(alice);

    System.out.println("\n--- Chat Session Begins ---\n");

    john.send("Hi everyone!");
    System.out.println();
    
    robert.send("Hey John, how are you?");
    System.out.println();
    
    alice.send("Hello guys!");
  }
} 