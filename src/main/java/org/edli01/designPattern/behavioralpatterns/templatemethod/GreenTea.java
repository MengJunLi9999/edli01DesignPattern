package org.edli01.designpattern.behavioralpatterns.templatemethod;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.templatemethod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete class for green tea preparation
 */
public class GreenTea extends BeverageTemplate {
  private boolean wantsCondiments;

  public GreenTea(boolean wantsCondiments) {
    this.wantsCondiments = wantsCondiments;
  }

  @Override
  protected void brew() {
    System.out.println("Steeping the green tea at 80°C");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Adding honey");
  }

  @Override
  protected String getBeverageName() {
    return "Green Tea";
  }

  @Override
  protected boolean customerWantsCondiments() {
    return wantsCondiments;
  }
} 