package org.edli01.designpattern.behavioralpatterns.templatemethod;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.templatemethod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Template Method Pattern
 */
public class EdLi01TemplateMethod {
  public static void main(String[] args) {
    System.out.println("=== Making Coffee with condiments ===");
    BeverageTemplate coffee = new Coffee(true);
    coffee.prepareBeverage();

    System.out.println("=== Making Tea without condiments ===");
    BeverageTemplate tea = new Tea(false);
    tea.prepareBeverage();

    System.out.println("=== Making Green Tea with condiments ===");
    BeverageTemplate greenTea = new GreenTea(true);
    greenTea.prepareBeverage();
  }
} 