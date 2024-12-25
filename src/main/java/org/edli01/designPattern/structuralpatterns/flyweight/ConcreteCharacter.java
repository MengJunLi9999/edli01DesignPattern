package org.edli01.designpattern.structuralpatterns.flyweight;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.flyweight
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete flyweight class for character
 */
public class ConcreteCharacter implements ICharacter {
  private char symbol;

  public ConcreteCharacter(char symbol) {
    this.symbol = symbol;
    // 模擬載入字符的耗時操作
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void display(int fontSize, String fontFamily, int position) {
    System.out.println("Displaying character '" + symbol + 
                      "' with font size " + fontSize + 
                      ", font family '" + fontFamily + 
                      "' at position " + position);
  }
} 