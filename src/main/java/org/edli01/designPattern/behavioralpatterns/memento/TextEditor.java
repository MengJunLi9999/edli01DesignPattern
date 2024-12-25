package org.edli01.designpattern.behavioralpatterns.memento;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.memento
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Originator class representing text editor
 */
public class TextEditor {
  private String content;
  private int cursorPosition;

  public TextEditor() {
    this.content = "";
    this.cursorPosition = 0;
  }

  public void write(String text) {
    String newContent = content.substring(0, cursorPosition) + 
                       text + 
                       content.substring(cursorPosition);
    content = newContent;
    cursorPosition += text.length();
    System.out.println("Writing: " + text);
    displayState();
  }

  public void moveCursor(int position) {
    if (position >= 0 && position <= content.length()) {
      this.cursorPosition = position;
      System.out.println("Moving cursor to position: " + position);
      displayState();
    }
  }

  public TextMemento save() {
    return new TextMemento(content, cursorPosition);
  }

  public void restore(TextMemento memento) {
    this.content = memento.getContent();
    this.cursorPosition = memento.getCursorPosition();
    System.out.println("Restoring to previous state");
    displayState();
  }

  private void displayState() {
    System.out.println("Current content: " + content);
    System.out.println("Cursor position: " + cursorPosition);
    System.out.println();
  }
} 