package org.edli01.designpattern.structuralpatterns.flyweight;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.flyweight
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Client class using flyweight pattern
 */
public class TextEditor {
  private CharacterFactory factory;
  private int fontSize;
  private String fontFamily;

  public TextEditor(int fontSize, String fontFamily) {
    this.factory = new CharacterFactory();
    this.fontSize = fontSize;
    this.fontFamily = fontFamily;
  }

  public void displayText(String text) {
    int position = 0;
    for (char symbol : text.toCharArray()) {
      ICharacter character = factory.getCharacter(symbol);
      character.display(fontSize, fontFamily, position++);
    }
  }

  public int getCharacterCount() {
    return factory.getCharacterCount();
  }
} 