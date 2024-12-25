package org.edli01.designpattern.structuralpatterns.proxy;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.proxy
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Proxy class for image
 */
public class ProxyImage implements IImage {
  private RealImage realImage;
  private String fileName;

  public ProxyImage(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void display() {
    if (realImage == null) {
      realImage = new RealImage(fileName);
    }
    realImage.display();
  }

  @Override
  public String getFileName() {
    return fileName;
  }
} 