package org.edli01.designpattern.behavioralpatterns.memento;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.memento
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Memento Pattern
 */
public class EdLi01Memento {
  public static void main(String[] args) {
    TextEditor editor = new TextEditor();
    History history = new History();

    // 初始文本
    editor.write("Hello ");
    history.push(editor.save());

    // 添加更多文本
    editor.write("World!");
    history.push(editor.save());

    // 移動游標
    editor.moveCursor(5);
    history.push(editor.save());

    // 插入新文本
    editor.write("Beautiful ");
    history.push(editor.save());

    System.out.println("=== Performing Undo Operations ===\n");

    // 執行撤銷操作
    TextMemento memento = history.undo();
    if (memento != null) {
      editor.restore(memento);
    }

    memento = history.undo();
    if (memento != null) {
      editor.restore(memento);
    }

    System.out.println("=== Performing Redo Operations ===\n");

    // 執行重做操作
    memento = history.redo();
    if (memento != null) {
      editor.restore(memento);
    }

    memento = history.redo();
    if (memento != null) {
      editor.restore(memento);
    }
  }
} 