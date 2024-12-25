package org.edli01.designpattern.structuralpatterns.proxy;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.proxy
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Real subject class for image
 */
public class RealImage implements IImage {
  private String fileName;

  public RealImage(String fileName) {
    this.fileName = fileName;
    loadFromDisk();
  }

  private void loadFromDisk() {
    System.out.println("Loading " + fileName + " from disk");
    // 模擬從磁盤加載圖片的耗時操作
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void display() {
    System.out.println("Displaying " + fileName);
  }

  @Override
  public String getFileName() {
    return fileName;
  }
} 