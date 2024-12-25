package org.edli01.designpattern.behavioralpatterns.templatemethod;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.templatemethod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete class for tea preparation
 */
public class Tea extends BeverageTemplate {
  private boolean wantsCondiments;

  public Tea(boolean wantsCondiments) {
    this.wantsCondiments = wantsCondiments;
  }

  @Override
  protected void brew() {
    System.out.println("Steeping the tea");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Adding lemon");
  }

  @Override
  protected String getBeverageName() {
    return "Tea";
  }

  @Override
  protected boolean customerWantsCondiments() {
    return wantsCondiments;
  }
} 