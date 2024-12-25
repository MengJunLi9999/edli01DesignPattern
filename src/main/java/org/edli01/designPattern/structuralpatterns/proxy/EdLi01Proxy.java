package org.edli01.designpattern.structuralpatterns.proxy;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.proxy
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Proxy Pattern
 */
public class EdLi01Proxy {
  public static void main(String[] args) {
    ImageManager manager = new ImageManager();

    // 添加多個圖片（此時並未加載）
    manager.addImage("photo1.jpg");
    manager.addImage("photo2.jpg");
    manager.addImage("photo3.jpg");

    // 列出所有可用的圖片
    manager.listImages();

    // 顯示特定圖片（此時才會加載）
    manager.displayImage(1);

    // 再次顯示相同圖片（不會重新加載）
    System.out.println("\nDisplaying same image again:");
    manager.displayImage(1);

    // 顯示所有圖片
    manager.displayAllImages();
  }
} 