package org.edli01.designpattern.structuralpatterns.flyweight;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.flyweight
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Flyweight Pattern
 */
public class EdLi01Flyweight {
  public static void main(String[] args) {
    TextEditor editor = new TextEditor(12, "Arial");

    // 顯示第一段文字
    System.out.println("Displaying first text:");
    editor.displayText("Hello World!");
    System.out.println("Unique characters created: " + 
                      editor.getCharacterCount());

    System.out.println("\nDisplaying second text:");
    editor.displayText("Hello Java!");
    System.out.println("Unique characters created: " + 
                      editor.getCharacterCount());

    System.out.println("\nDisplaying third text:");
    editor.displayText("Hello World Again!");
    System.out.println("Final unique characters created: " + 
                      editor.getCharacterCount());
  }
} 