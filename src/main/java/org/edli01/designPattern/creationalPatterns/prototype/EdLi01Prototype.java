package org.edli01.designpattern.creationalpatterns.prototype;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.prototype
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:12
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Prototype Pattern
 */
public class EdLi01Prototype {
  public static void main(String[] args) {
    DocumentManager manager = new DocumentManager();

    // 創建原型文件
    TextDocument textDoc = new TextDocument("Hello World", "TXT");
    ImageDocument imageDoc = new ImageDocument("photo", "1920x1080");

    // 添加到管理器
    manager.addDocument("text", textDoc);
    manager.addDocument("image", imageDoc);

    // 複製文件
    IDocument textCopy = manager.getDocument("text");
    IDocument imageCopy = manager.getDocument("image");

    // 顯示複製結果
    System.out.println("Original Documents:");
    textDoc.display();
    imageDoc.display();

    System.out.println("\nCloned Documents:");
    textCopy.display();
    imageCopy.display();
  }
} 