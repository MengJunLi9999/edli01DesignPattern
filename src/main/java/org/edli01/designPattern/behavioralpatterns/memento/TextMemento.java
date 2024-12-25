package org.edli01.designpattern.behavioralpatterns.memento;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.memento
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Memento class storing editor state
 */
public class TextMemento {
  private final String content;
  private final int cursorPosition;

  public TextMemento(String content, int cursorPosition) {
    this.content = content;
    this.cursorPosition = cursorPosition;
  }

  public String getContent() {
    return content;
  }

  public int getCursorPosition() {
    return cursorPosition;
  }
} 