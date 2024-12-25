package org.edli01.designpattern.creationalpatterns.prototype;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.prototype
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:03
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete prototype for text documents
 */
public class TextDocument implements IDocument {
  private String content;
  private String format;

  public TextDocument(String content, String format) {
    this.content = content;
    this.format = format;
  }

  @Override
  public IDocument clone() {
    return new TextDocument(this.content, this.format);
  }

  @Override
  public void display() {
    System.out.println("Text Document [" + format + "]: " + content);
  }
} 