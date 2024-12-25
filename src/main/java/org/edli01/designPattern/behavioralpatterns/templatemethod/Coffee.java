package org.edli01.designpattern.behavioralpatterns.templatemethod;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.templatemethod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete class for coffee preparation
 */
public class Coffee extends BeverageTemplate {
  private boolean wantsCondiments;

  public Coffee(boolean wantsCondiments) {
    this.wantsCondiments = wantsCondiments;
  }

  @Override
  protected void brew() {
    System.out.println("Dripping coffee through filter");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Adding sugar and milk");
  }

  @Override
  protected String getBeverageName() {
    return "Coffee";
  }

  @Override
  protected boolean customerWantsCondiments() {
    return wantsCondiments;
  }
} 