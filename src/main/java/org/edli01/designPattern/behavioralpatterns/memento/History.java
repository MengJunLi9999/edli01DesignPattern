package org.edli01.designpattern.behavioralpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.memento
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Caretaker class managing editor history
 */
public class History {
  private List<TextMemento> mementos = new ArrayList<>();
  private int currentIndex = -1;

  public void push(TextMemento memento) {
    // 如果在歷史記錄中間進行了新的操作，刪除當前位置之後的所有記錄
    while (currentIndex < mementos.size() - 1) {
      mementos.remove(mementos.size() - 1);
    }
    mementos.add(memento);
    currentIndex++;
  }

  public TextMemento undo() {
    if (currentIndex > 0) {
      return mementos.get(--currentIndex);
    }
    return null;
  }

  public TextMemento redo() {
    if (currentIndex < mementos.size() - 1) {
      return mementos.get(++currentIndex);
    }
    return null;
  }
} 