package org.edli01.designpattern.creationalpatterns.prototype;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.prototype
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:06
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete prototype for image documents
 */
public class ImageDocument implements IDocument {
  private String name;
  private String resolution;

  public ImageDocument(String name, String resolution) {
    this.name = name;
    this.resolution = resolution;
  }

  @Override
  public IDocument clone() {
    return new ImageDocument(this.name, this.resolution);
  }

  @Override
  public void display() {
    System.out.println("Image Document: " + name + " [" + resolution + "]");
  }
} 