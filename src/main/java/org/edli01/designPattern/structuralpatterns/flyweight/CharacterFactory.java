package org.edli01.designpattern.structuralpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.flyweight
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Flyweight factory class for managing character objects
 */
public class CharacterFactory {
  private Map<Character, ICharacter> characters = new HashMap<>();

  public ICharacter getCharacter(char symbol) {
    // 如果字符已存在，則返回現有實例
    if (characters.containsKey(symbol)) {
      return characters.get(symbol);
    }
    // 如果字符不存在，創建新實例並存儲
    ICharacter character = new ConcreteCharacter(symbol);
    characters.put(symbol, character);
    return character;
  }

  public int getCharacterCount() {
    return characters.size();
  }
} 